package com.construx.developertesting.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTypeTest {
	@Test
	public void identifyAnScaleneTriangle() throws Exception {
		assertEquals(TriangleType.SCALENE, TriangleType.identify(6, 5, 4));
	}

	@Test
	public void identifyAnEquilateralTriangle() {
		assertEquals(TriangleType.EQUILATERAL, TriangleType.identify(6, 6, 6));
	}

	@Test
	public void identifyAnIsocelesTriangle() throws Exception {
		assertEquals(TriangleType.ISOSCELES, TriangleType.identify(6, 6, 4));
		assertEquals(TriangleType.ISOSCELES, TriangleType.identify(4, 6, 6));
		assertEquals(TriangleType.ISOSCELES, TriangleType.identify(6, 4, 6));
	}

	@Test
	public void aTriangleWithASideWithZeroValueIsInvalid() throws Exception {
		assertEquals(TriangleType.INVALID, TriangleType.identify(0, 4, 5));
	}

	@Test
	public void aTriangleWithASideWithANegativeValueIsInvalid()
			throws Exception {
		assertEquals(TriangleType.INVALID, TriangleType.identify(-1, 4, 5));
	}

	@Test
	public void whenTheSumOfTwoSidesIsEqualToTheThird_TheTriangleIsInvalid()
			throws Exception {
		assertEquals(TriangleType.INVALID, TriangleType.identify(1, 2, 3));
		assertEquals(TriangleType.INVALID, TriangleType.identify(2, 3, 1));
		assertEquals(TriangleType.INVALID, TriangleType.identify(3, 2, 1));
	}

	@Test
	public void aTriangleWithTheSumOfTwoSidesAreLessThanTheThirdIsInvalid()
			throws Exception {
		assertEquals(TriangleType.INVALID, TriangleType.identify(6, 2, 3));
		assertEquals(TriangleType.INVALID, TriangleType.identify(2, 6, 3));
		assertEquals(TriangleType.INVALID, TriangleType.identify(3, 2, 6));
	}

	@Test
	public void aTriangleWithAllSidesWithZeroValueIsInvalid() throws Exception {
		assertEquals(TriangleType.INVALID, TriangleType.identify(0, 0, 0));
	}
}
