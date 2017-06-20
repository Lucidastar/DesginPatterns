package com.lucidastar.singleton;

public final class ThreadSafeLazyLoadedIvoryTower {
	private static ThreadSafeLazyLoadedIvoryTower instance;

	  private ThreadSafeLazyLoadedIvoryTower() {}

	  /**
	   * The instance gets created only when it is called for first time. Lazy-loading
	   * 懒加载  恶汉式并且线程安全
	   */
	  public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {

	    if (instance == null) {
	      instance = new ThreadSafeLazyLoadedIvoryTower();
	    }

	    return instance;
	  }
}
