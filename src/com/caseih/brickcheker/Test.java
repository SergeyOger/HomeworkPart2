package com.caseih.brickcheker;

public class Test {

	public static void main(String[] args) {
		BrickCheck b = new BrickCheck(3,4,6);
		b.setHoleParameters(6, 3);
		b.tryLowerVertically();
		b.tryLowerHorizontally();
		b.tryLowerSideways();
		

	}

}
