package com.construx.developertesting.triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void recognizeAValidScaleneTriangle() throws Exception {
		// assertTrue(new Triangle(6, 6, 4).getType() == "Scalene");
		assertEquals("Scalene", new Triangle(6, 5, 4).getType());
	}

	@Test
	public void recognizeAnEquilateralTriangle() {
		assertEquals("Equilateral", new Triangle(6, 6, 6).getType());
	}

	@Test
	public void recognizeAnIsocelesTriangle() throws Exception {
		assertEquals("Isosceles", new Triangle(6, 6, 4).getType());
		assertEquals("Isosceles", new Triangle(4, 6, 6).getType());
		assertEquals("Isosceles", new Triangle(6, 4, 6).getType());
	}

	@Test
	public void aTriangleWithASideWithZeroValueIsInvalid() throws Exception {
		assertEquals("Invalid", new Triangle(0, 4, 5).getType());
	}

	@Test
	public void aTriangleWithASideWithANegativeValueIsInvalid()
			throws Exception {
		assertEquals("Invalid", new Triangle(-1, 4, 5).getType());
	}

	@Test
	public void aTriangleWithTheSumOfTwoSidesAreEqualToTheThirdIsInvalid()
			throws Exception {
		assertEquals("Invalid", new Triangle(1, 2, 3).getType());
		assertEquals("Invalid", new Triangle(2, 3, 1).getType());
		assertEquals("Invalid", new Triangle(3, 2, 1).getType());
	}

	@Test
	public void aTriangleWithTheSumOfTwoSidesAreLessThanTheThirdIsInvalid()
			throws Exception {
		assertEquals("Invalid", new Triangle(6, 2, 3).getType());
		assertEquals("Invalid", new Triangle(2, 6, 3).getType());
		assertEquals("Invalid", new Triangle(3, 2, 6).getType());
	}

	@Test
	public void aTriangleWithAllSidesWithZeroValueIsInvalid() throws Exception {
		assertEquals("Invalid", new Triangle(0, 0, 0).getType());
	}
}
