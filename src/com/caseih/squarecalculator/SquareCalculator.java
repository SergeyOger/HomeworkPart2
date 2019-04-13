package com.caseih.squarecalculator;

public class SquareCalculator {

	public static void main(String[] args) {
		String separator = ",";
		int number = 15;
		int startPoint = (int) Math.sqrt(number);
		//System.out.println("Start point " + startPoint);
		int length = 5;

		int[] numbers = new int[length];

		for (int i = -1; i < length; i++) {
			//System.out.println(i);
			if ((startPoint * startPoint) > number) {
				numbers[i] = startPoint;
				//System.out.println("Added to array " + numbers[i]);
			}
			startPoint++;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (i < numbers.length - 1) {
				System.out.print(numbers[i] + separator);
			} else {
				System.out.print(numbers[i]);
			}
		}
			

	}

}
