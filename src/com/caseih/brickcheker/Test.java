package com.caseih.brickcheker;

public class Test {

	public static void main(String[] args) {
		BrickCheck b = new BrickCheck(8,8,8);
		b.setHoleParameters(8, 8);
		b.tryLowerVertically();
		b.tryLowerHorizontally();
		b.tryLowerSideways();
		

	}

}
