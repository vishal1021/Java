package com.in.calculator;

public class SwitchStatement {

	public static void main(String[] args) {
		puzzle1();
		puzzle2();
		puzzle3();
		puzzle4();
		puzzle5();

	}



	private static void puzzle5() {
		// TODO Auto-generated method stub

	}

	private static void puzzle4() {
		int number = 10;
		int i = number * 2;
		switch (i) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}

	}

	private static void puzzle1() {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
		case 3:
			System.out.println(3);
		default:
			System.out.println("Default");
		}

	}

	private static void puzzle2() {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:

		case 3:
			System.out.println("Number is 2 and 3");
			break;
		default:
			System.out.println("Default");
			break;
		}

	}

	private static void puzzle3() {
		int number = 10;
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("Default");
		}

	}

}
