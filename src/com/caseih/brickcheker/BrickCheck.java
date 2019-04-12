package com.caseih.brickcheker;

public class BrickCheck {
	BrickCheck(int brickHeigth, int brickWidth, int brickLength) {
		this.brickHeigth = brickHeigth;
		this.brickWidth = brickWidth;
		this.brickLength = brickLength;

	}
	public void setHoleParameters(int holeLength, int holeWidth) {
		this.holeLength = holeLength;
		this.holeWidth = holeWidth;
	}

	private int holeLength = 10;
	private int holeWidth = 5;
	private int brickHeigth = 4;
	private int brickWidth = 3;
	private int brickLength = 11;

	public void tryLowerHorizontally() {
		if (((Math.min(holeLength, holeWidth)) >= (Math.min(brickLength, brickWidth)))
				&& ((Math.max(holeLength, holeWidth)) >= (Math.max(brickLength, brickWidth)))) {
			System.out.println("If you lower it horizontally, the brick will pass");
		} else {
			System.out.println("If you lower it horizontally, the brick will not pass");
		}
	}

	public void tryLowerVertically() {
		if (((Math.min(holeLength, holeWidth)) >= (Math.min(brickHeigth, brickWidth)))
				&& ((Math.max(holeLength, holeWidth)) >= (Math.max(brickHeigth, brickWidth)))) {
			System.out.println("If you lower it vertically, the brick will pass");
		} else {
			System.out.println("If you lower it vertically, the brick will not pass");
		}
	}

	public void tryLowerSideways() {
		if (((Math.min(holeLength, holeWidth)) >= (Math.min(brickHeigth, brickLength)))
				&& ((Math.max(holeLength, holeWidth)) >= (Math.max(brickHeigth, brickLength)))) {
			System.out.println("If you lower it sideways, the brick will pass");
		} else {
			System.out.println("If you lower it sideways, the brick will not pass");
		}
	}

}
