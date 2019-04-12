package com.caseih.entrepreneur;

public class Entrepreneur {
	private int profit;
	private int creditSum;
	private int interestRate;
	private static int counter;
	
	public Entrepreneur(int creditSum, int interestRate, int profit) {
		this.creditSum = creditSum;
		this.interestRate = interestRate;
		this.profit = profit;
		counter++;
	}
	
	public void enterpriseLaunch() {

		new Credit(creditSum, interestRate);
		new NewEnterprise(profit);
		
		int realProfitPerYear = 0;
		int termOfCrediting = 0;

		for (int i = 0; i <= termOfCrediting; i++) {
			termOfCrediting = i+1;
			System.out.println("Years of lending " + termOfCrediting); 
			System.out.println("Sum of credit " + Credit.getSumOfCredit());
			System.out.println("Sum of credit with charge " + Credit.chargeInterestPerYear());
			System.out.println("Enterparaise profit " + NewEnterprise.getProfit());
			realProfitPerYear = NewEnterprise.getProfit() - Credit.chargeInterestPerYear();
			System.out.println("The debt of the bank's enterprise " + realProfitPerYear);
			
			if (realProfitPerYear < 0) {
				Credit.changeSumOfCredit(Math.abs(realProfitPerYear));
				
			} else {
				break;
			}
		}
		
		System.out.println("Congratulations, you did it in " + termOfCrediting + " year");
	}
	
	public static void getCounter() {
		System.out.println("Number of entrepreneurs: " + counter);;
	}
}
