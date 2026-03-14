package com.in.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		Student student = new Student("Ranga", new int[] { 97, 98, 100 });
		Student student1 = new Student("Ashish", new int[] { 57, 98, 60 });
		Student student2 = new Student("Sahil", new int[] { 97, 48, 10 });

		int number = student.getNumberofMarks();
		System.out.println("number of marks  " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks  " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("maximum of marks  " + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("minimum of marks  " + minimumMark);

		BigDecimal average = student.getAverageMark();
		System.out.println("Average  " + average);
	}

}
