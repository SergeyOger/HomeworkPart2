package com.caseih.entrepreneur;

public class NewEnterprise {

	private int estimatedProfitPerYear;

	NewEnterprise(int estimatedProfitPerYear) {
		this.estimatedProfitPerYear = estimatedProfitPerYear;
	}

	public int getProfit() {
		return estimatedProfitPerYear;
	}

}
