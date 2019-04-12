package com.caseih.squarecalculator;

public class SquareCalculator {

	public static void main(String[] args) {
		int number = 120;
		int startPoint = (int) Math.sqrt(number);
		// System.out.println(startPoint);
		int length = 10;

		int[] numbers = new int[length];

		for (int i = -1; i < length; i++) {
			//System.out.println(i);
			if ((startPoint * startPoint) > number) {
				numbers[i] = startPoint;
				//System.out.println("Added to array " + numbers[i]);
			}
			startPoint++;
		}
		
		for (int i : numbers) {
			System.out.println(i);
		}

	}

}
