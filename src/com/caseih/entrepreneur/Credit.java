package com.caseih.entrepreneur;

public class Credit {
	private  int sumOfCredit;
	private   int interestRate;
	
	public Credit(int sumOfCredit, int interestRate) {
		this.sumOfCredit = sumOfCredit;
		this.interestRate = interestRate;
	}

	

	public  int chargeInterestPerYear() {
		sumOfCredit = sumOfCredit + ((sumOfCredit / 100) * interestRate); // тело кредита + проценты в месяц
		return sumOfCredit;
	}
	
	public  void changeSumOfCredit(int sumOfCurrentCredit) {  // установить сумму остатка по кредиту 
		sumOfCredit = sumOfCredit - sumOfCurrentCredit;
	}
	
	public  int getSumOfCredit() {
		return sumOfCredit;
	}

}
