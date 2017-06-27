package com.lucidastar.callback;

public class Test {

	public static void main(String[] args) {
		Task task = new SimpleTask();
		task.executeWith(new Callback() {
			
			@Override
			public void call() {
				System.out.println("I have done");				
			}
		});

	}

}
