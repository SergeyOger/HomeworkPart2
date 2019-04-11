package com.caseih.entrepreneur;

public class Credit {
	
	public Credit(int sumOfCredit, int interestRate) {
		this.sumOfCredit = sumOfCredit;
		this.interestRate = interestRate;
	}

	private int sumOfCredit;
	private int interestRate;

	public int chargeInterestPerYear() {
		sumOfCredit = sumOfCredit + ((sumOfCredit / 100) * interestRate); // тело кредита + проценты в месяц
		return sumOfCredit;
	}
	
	public void setSumOfCredit(int sumOfCredit) {  // установить сумму остатка по кредиту 
		this.sumOfCredit = sumOfCredit;
	}
	
	public int getSumOfCredit() {
		return sumOfCredit;
	}

}
