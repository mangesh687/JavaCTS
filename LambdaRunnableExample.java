package com.apps;

public class LambdaRunnableExample {

	public static void main(String[] args) {
		Runnable lambdaRunnable = () -> {
			System.out.println("Lambda Runnable in action!");
		};

		Thread thread = new Thread(lambdaRunnable);
		thread.start();
	}

}
