package com.caseih.entrepreneur;

public class Entrepreneur {
    public static void main(String[] args) {
        int sumOfCredit = 10000;
        int profitSum = 1000;
        int interestRate = 20;
        int previousAmount = 0;
        int maximumLendingPeriod = 15;

        for (int iterator = 0;iterator < maximumLendingPeriod; iterator++) {
            sumOfCredit = ((sumOfCredit + (sumOfCredit / 100) * interestRate) - profitSum);
            System.out.println(sumOfCredit);
            if ((iterator > 0 && previousAmount < sumOfCredit) || iterator == (maximumLendingPeriod - 1)) {
                System.out.println("The loan will not be paid");
                break;
            } else {
                if (sumOfCredit > 0) {
                    //System.out.println("You duty is  " + sumOfCredit);
                    previousAmount = sumOfCredit;
                } else {
                    System.out.println("The loan has been paid for " + iterator + " year");
                    break;
                }
            }

        }

    }
}
