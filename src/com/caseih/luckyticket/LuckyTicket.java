package com.caseih.luckyticket;

public class LuckyTicket {

	public static void main(String[] args) {
		/*
		 * Lucky ticket Part 1
		 * 
		 * String ticketNumber = "456654"; char[] ticketNumbers =
		 * ticketNumber.toCharArray();
		 * 
		 * int firstPartOfNumber = 0; int secondPartOfNumber = 0;
		 * 
		 * for (int i = 0; i < ticketNumbers.length/2; i++) { firstPartOfNumber =
		 * firstPartOfNumber + Integer.valueOf(String.valueOf((char)ticketNumbers[i]));
		 * }
		 * 
		 * for (int i = (ticketNumbers.length - 1); i >= ticketNumbers.length/2; i--) {
		 * secondPartOfNumber = secondPartOfNumber +
		 * Integer.valueOf(String.valueOf((char)ticketNumbers[i])); }
		 * 
		 * if (firstPartOfNumber == secondPartOfNumber) {
		 * System.out.println("Happy ticket"); } else {
		 * System.out.println("Regular ticket"); }
		 */

		// Lucky ticket Part 2

		String minValueOfTicket = "000001";
		int intMinValueOfTicket = Integer.valueOf(minValueOfTicket);

		String maxValueOfTicket = "999999";
		int intMaxValueOfTicket = Integer.valueOf(maxValueOfTicket);

		int numberOfLuckyTickets = 0;
		int numberOfRegularTickets = 0;

		int sumOfPairNumbers = 0;
		int sumOfOddNumbers = 0;

		for (int counterOfTickets = intMinValueOfTicket; counterOfTickets <= intMaxValueOfTicket; counterOfTickets++) {
			System.out.println(counterOfTickets);
			// System.out.println(intMinValueOfTicket);

			char[] numbersOfTicket = String.valueOf(String.format("%06d", counterOfTickets)).toCharArray();
			// System.out.println(numbersOfTicket);

			for (int i = 0; i < numbersOfTicket.length; i++) {
				if ((numbersOfTicket[i] % 2) == 0) {
					sumOfPairNumbers += Integer.valueOf(String.valueOf((char) numbersOfTicket[i]));

				} else {
					sumOfOddNumbers += Integer.valueOf(String.valueOf((char) numbersOfTicket[i]));

				}

			}

			if (sumOfPairNumbers == sumOfOddNumbers) {
				// System.out.println("Happy ticket");
				numberOfLuckyTickets += 1;

			} else {
				// System.out.println("Regular ticket");
				numberOfRegularTickets += 1;
			}

		}
		System.out.println("Number of lucky tickets: " + numberOfLuckyTickets);
		System.out.println("Number of regular tickets: " + numberOfRegularTickets);

	}

}
