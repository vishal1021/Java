package com.in.calculator;

public class ifStatementRunner {

	public static void main(String[] args) {
		puzzle1();
		puzzle2();


	}


	private static void puzzle2() {
		int number = 5;
		if (number < 0) {
			number = number + 10;
		}
		number++;
		System.out.println(number);

	}

	private static void puzzle1() {
		int i = 31;
		if (i > 23) {
			System.out.println(1);
		} else if (i < 30) {
			System.out.println(2);
		} else if (i < 23) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}

	}


}
