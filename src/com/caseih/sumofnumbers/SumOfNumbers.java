package com.caseih.sumofnumbers;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert number");

		while (scanner.hasNextLong()) {
			Long number = scanner.nextLong();
			long sumOfNumbers = 0;
			char[] arrayOfChar = String.valueOf(number).toCharArray();
			for (int i : arrayOfChar) {
				sumOfNumbers = sumOfNumbers + Long.valueOf(String.valueOf((char) i));
			}
			System.out.println("Sum of numbers: " + sumOfNumbers);
			System.out.println("Insert next number");
		}
		System.out.println("Program finished");
		scanner.close();

	}

}
