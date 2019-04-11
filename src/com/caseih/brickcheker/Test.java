package com.caseih.brickcheker;

public class Test {

	public static void main(String[] args) {
		BrickCheck b = new BrickCheck(6,3,2);
		b.setHoleParameters(3, 8);
		b.tryLowerVertically();
		b.tryLowerHorizontally();
		b.tryLowerSideways();
		

	}

}
