package com.caseih.entrepreneur;

public class Entrepreneur {
	public static void main(String[] args) {

		int realProfitPerYear = 0;
		int termOfCrediting = 0;

		Credit credit = new Credit(3t000, 20);
		NewEnterprise enterprise = new NewEnterprise(1000);

		for (int i = 0; i <= termOfCrediting; i++) {
			termOfCrediting = i+1;
			System.out.println("Months of lending " + termOfCrediting); 
			System.out.println("Sum of credit " + credit.getSumOfCredit());
			System.out.println("Sum of credit with charge " + credit.chargeInterestPerYear());
			System.out.println("Enterparaise profit " + enterprise.getProfit());
			realProfitPerYear = enterprise.getProfit() - credit.chargeInterestPerYear();
			System.out.println("The debt of the bank's enterprise " + realProfitPerYear);
			
			if (realProfitPerYear < 0) {
				credit.setSumOfCredit(Math.abs(realProfitPerYear));
				
			} else {
				break;
			}
		}
		
		System.out.println("Congratulations, you did it in " + termOfCrediting + " year");
	}
}
