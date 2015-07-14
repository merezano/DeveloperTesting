package com.construx.developertesting.triangle;

public class Triangle {

	int a, b, c;

	public Triangle(int i, int j, int k) {
		a = i;
		b = j;
		c = k;
	}

	public String getType() {
		String type = "";

		if (isInvalid())
			type = "Invalid";

		else if (allSidesAreDifferent())
			type = "Scalene";

		else if (allSidesAreEqual())
			type = "Equilateral";

		else if (twoSidesAreEqual())
			type = "Isosceles";

		return type;
	}

	private boolean twoSidesAreEqual() {
		return a == b || b == c || a == c;
	}

	private boolean isInvalid() {
		return a + b <= c || b + c <= a || a + c <= b;
	}

	private boolean allSidesAreEqual() {
		return (a == b && b == c);
	}

	private boolean allSidesAreDifferent() {
		return (a != b && b != c && a != c);
	}
}
