package com.lucidastar.singleton;

public final class ThreadSafeDoubleCheckLocking {
	private static volatile ThreadSafeDoubleCheckLocking instance;

	  /**
	   * private constructor to prevent client from instantiating.
	   */
	  private ThreadSafeDoubleCheckLocking() {
	    // to prevent instantiating by Reflection call
	    if (instance != null) {
	      throw new IllegalStateException("Already initialized.");
	    }
	  }

	  /**
	   * Public accessor.
	   *
	   * @return an instance of the class.
	   */
	  public static ThreadSafeDoubleCheckLocking getInstance() {
	    // local variable increases performance by 25 percent
	    // Joshua Bloch "Effective Java, Second Edition", p. 283-284
	    
	    ThreadSafeDoubleCheckLocking result = instance;
	    // Check if singleton instance is initialized. If it is initialized then we can return the instance.
	    //检查是否已经实例化，如果实例化了就返回
	    if (result == null) {
	      // It is not initialized but we cannot be sure because some other thread might have initialized it
	      // in the meanwhile. So to make sure we need to lock on an object to get mutual exclusion.
	    	//如果没有实例化但是我们也不能确定此时其他的线程已经把它实例化，因此我们需要锁定这个对象得到排斥
	      synchronized (ThreadSafeDoubleCheckLocking.class) {
	        // Again assign the instance to local variable to check if it was initialized by some other thread
	        // while current thread was blocked to enter the locked zone. If it was initialized then we can 
	        // return the previously created instance just like the previous null check.
	    	  //再次将实例赋值给局部变量，以检查它是否被其他线程初始化，而当前线程被阻塞以进入锁定区域。如果初始化了，那么我们可以像以前的空校验一样返回先前创建的实例。
	        result = instance;
	        if (result == null) {
	          // The instance is still not initialized so we can safely (no other thread can enter this zone)
	          // create an instance and make it our singleton instance.
	        //这个实例仍然没有初始化，所以我们可以安全地（没有其他线程可以进入这个区域）创建一个实例，并使它成为我们的单实例。
	          instance = result = new ThreadSafeDoubleCheckLocking();
	        }
	      }
	    }
	    return result;
	  }
}
