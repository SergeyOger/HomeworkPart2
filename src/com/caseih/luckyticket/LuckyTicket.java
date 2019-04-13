package com.caseih.luckyticket;

public class LuckyTicket {

    public static void main(String[] args) {

        String minValueOfTicket = "000000";
        int intMinValueOfTicket = Integer.valueOf(minValueOfTicket);

        String maxValueOfTicket = "000500";
        int intMaxValueOfTicket = Integer.valueOf(maxValueOfTicket);

        // Lucky ticket Part 1

        System.out.println("First void for find lucky tickets");
        int counterOfLuckyNumbers = 0;
        int counterOfRegulartickets = 0;
        for (int counterOfTickets = intMinValueOfTicket; counterOfTickets <= intMaxValueOfTicket; counterOfTickets++) {

            char[] ticketNumbers = String.valueOf(String.format("%06d", counterOfTickets)).toCharArray();

            int firstPartOfNumber = 0;
            int secondPartOfNumber = 0;

            for (int i = 0; i < ticketNumbers.length / 2; i++) {
                firstPartOfNumber = firstPartOfNumber + Integer.valueOf(String.valueOf((char) ticketNumbers[i]));
            }

            for (int i = (ticketNumbers.length - 1); i >= ticketNumbers.length / 2; i--) {
                secondPartOfNumber = secondPartOfNumber + Integer.valueOf(String.valueOf((char) ticketNumbers[i]));
            }

            if (firstPartOfNumber == secondPartOfNumber) {
                // System.out.println("Happy ticket");
                counterOfLuckyNumbers++;
            } else { //
                // System.out.println("Regular ticket");
                counterOfRegulartickets++;
            }
        }
        System.out.println("Number of lucky tickets, first void: " + counterOfLuckyNumbers);
        System.out.println("Number of regular tickets, first void: " + counterOfRegulartickets);

        System.out.println();

        // Lucky ticket Part 2

        System.out.println("Second void for find lucky tickets");
        int numberOfLuckyTickets = 0;
        int numberOfRegularTickets = 0;

        int sumOfPairNumbers = 0;
        int sumOfOddNumbers = 0;
        int counterOfTicketsVoid2 = 0;

        for (int counterOfTickets = intMinValueOfTicket; counterOfTickets <= intMaxValueOfTicket; counterOfTickets++) {
            // System.out.println(counterOfTickets);
            // System.out.println(intMinValueOfTicket);
            counterOfTicketsVoid2++;

            char[] numbersOfTicket = String.valueOf(String.format("%06d", counterOfTickets)).toCharArray();
            // System.out.println("Char array" + String.valueOf(numbersOfTicket));

            for (int i = 0; i < numbersOfTicket.length; i++) {
                // Here is problem int sum not reset
                if ((numbersOfTicket[i] % 2) == 0) {
                    sumOfPairNumbers = sumOfPairNumbers + Integer.valueOf(String.valueOf((char) numbersOfTicket[i]));
                    // System.out.println("Char pair num " + numbersOfTicket[i]);

                } else {
                    sumOfOddNumbers = sumOfOddNumbers + Integer.valueOf(String.valueOf((char) numbersOfTicket[i]));
                    // System.out.println("Char odd number " + numbersOfTicket[i]);
                }

            }
            if (sumOfPairNumbers == sumOfOddNumbers) {
                numberOfLuckyTickets++;

                // System.out.println("lucly tiket " + String.valueOf(numbersOfTicket));

            } else {
                numberOfRegularTickets++;

                // System.out.println("Summ of regular tickets " + numberOfRegularTickets);
            }
            sumOfPairNumbers = 0;
            sumOfOddNumbers = 0;

        }
        System.out.println("Number of lucky tickets, second void: " + numberOfLuckyTickets);
        System.out.println("Number of regular tickets, second void: " + (numberOfRegularTickets));
        System.out.println();

        if (counterOfLuckyNumbers > numberOfLuckyTickets) {
            System.out.println("First void won on " + (counterOfLuckyNumbers - numberOfLuckyTickets) + " tickets");
        } else {
            System.out.println("Second void won on " + (numberOfLuckyTickets - counterOfLuckyNumbers) + " tickets");
        }
        System.out.println("All tickets " + counterOfTicketsVoid2);

    }

}
