package com.lucidastar.callback;

public abstract class Task {

	 /**
	   * Execute with callback
	   */
	  public final void executeWith(Callback callback) {
	    execute();
	    if (callback != null) {
	      callback.call();
	    }
	  }
	
	public abstract void execute();
}
