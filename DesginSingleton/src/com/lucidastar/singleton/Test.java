package com.lucidastar.singleton;

public class Test {

	public static void main(String[] args) {

		// eagerly initialized singleton
	    IvoryTower ivoryTower1 = IvoryTower.getInstance();
	    IvoryTower ivoryTower2 = IvoryTower.getInstance();
	    System.out.println("开始");
	    System.out.println("ivoryTower1={}"+ ivoryTower1);
	    System.out.println("ivoryTower2={}"+ ivoryTower2);

	    // lazily initialized singleton
	    ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 =
	        ThreadSafeLazyLoadedIvoryTower.getInstance();
	    ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 =
	        ThreadSafeLazyLoadedIvoryTower.getInstance();
	    System.out.println("threadSafeIvoryTower1={}"+ threadSafeIvoryTower1);
	    System.out.println("threadSafeIvoryTower2={}"+ threadSafeIvoryTower2);

	    // enum singleton
	    EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
	    EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
	    System.out.println("enumIvoryTower1={}"+ enumIvoryTower1);
	    System.out.println("enumIvoryTower2={}"+ enumIvoryTower2);

	    // double checked locking
	    ThreadSafeDoubleCheckLocking dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
	    System.out.println(dcl1.toString());
	    ThreadSafeDoubleCheckLocking dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
	    System.out.println(dcl2.toString());

	    // initialize on demand holder idiom
	    InitializingOnDemandHolderIdiom demandHolderIdiom =
	        InitializingOnDemandHolderIdiom.getInstance();
	    System.out.println(demandHolderIdiom.toString());
	    InitializingOnDemandHolderIdiom demandHolderIdiom2 =
	        InitializingOnDemandHolderIdiom.getInstance();
	    System.out.println(demandHolderIdiom2.toString());
	}

}
