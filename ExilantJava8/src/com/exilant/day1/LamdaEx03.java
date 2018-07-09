package com.exilant.day1;

public class LamdaEx03 {

	// this program to show simple working of functional interfaces
	// if you have an interface and that interface has exactly 1 method
	// then that interface can be eligible to be function interface
	@FunctionalInterface
	interface MathOperation {
		int operation(int num1, int num2);
	}

	public static int operate(int num1, int num2, MathOperation opr) {
		return opr.operation(num1, num2);
	}

	public static void main(String[] args) {
		MathOperation add = (int num1, int num2) -> num1 + num2;
		MathOperation sub = (int num1, int num2) -> num1 - num2;
		System.out.println(operate(10, 20, add));
		System.out.println(operate(20, 30, sub));

		// System.out.println(operation(20, 30));
		MathOperation m1 = new MathOperation() {

			@Override
			public int operation(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(m1.operation(10, 20));
		MathOperation m2 = (num1, num2) -> (num1 + num2);
		System.out.println(m2.operation(20,30));
	}

}
