package com.exilant.day1;

public class LambdaThread04 {

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("hi im ananymos call..start");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Anonymous call exiting");
			}
		}).start();

		// Lambda based
		new Thread(() -> {
			System.out.println("hi am from lambda");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("lambda exisiting");
		}).start();
	}

}
