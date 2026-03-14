package com.in.calculator;

public class WeekDay {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(0));
		System.out.println(isWeekDay(5));

	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return false;
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		case 6:
			return false;
		}

		return false;
	}

	private static String determineNameOfDay(int dayNumber) {
		String result = "";
		switch (dayNumber) {
		case 0:
			result = "Sunday";
			break;
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
			break;
		}

		return result;
	}

}
