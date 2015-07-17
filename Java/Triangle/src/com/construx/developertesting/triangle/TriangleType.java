package com.construx.developertesting.triangle;

public enum TriangleType {
	INVALID, SCALENE, EQUILATERAL, ISOSCELES;

	public static TriangleType identify(final int a, final int b, final int c) {
		if (sideLenghtsFormATriangle(a, b, c))
			if (allSidelengthsAreEqual(a, b, c))
				return EQUILATERAL;
			else if (twoOfTheSidelengthsAreEqual(a, b, c))
				return ISOSCELES;
			else
				return SCALENE;
		else
			return INVALID;
	}

	private static boolean twoOfTheSidelengthsAreEqual(int a, int b, int c) {
		return a == b || b == c || c == a;
	}

	private static boolean allSidelengthsAreEqual(int a, int b, int c) {
		return a == b && b == c;
	}

	/**
	 * The sum of the lengths of any two sides must be greater than or equal to
	 * the length of the remaining side. However, although valid, this
	 * implementation considers the degenerate case (x + y = z) invalid.
	 * 
	 * @return True if the sum of the lengths of any two sides is greater than
	 *         the length of the remaining side
	 */
	private static boolean sideLenghtsFormATriangle(int a, int b, int c) {
		return a + b > c && b + c > a && a + c > b;
	}
}
