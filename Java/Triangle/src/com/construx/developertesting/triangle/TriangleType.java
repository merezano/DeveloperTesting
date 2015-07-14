package com.construx.developertesting.triangle;

public enum TriangleType {
	EQUILATERAL, INVALID, ISOSCELES, SCALENE;

	public static TriangleType classify(int a, int b, int c) {
		if (a == b && b == c)
			return EQUILATERAL;
		else if (a == b || b == c || c == a)
			return ISOSCELES;
		return SCALENE;
	}
}
