// ***************************************************************************
// Copyright (c) 2015, Construx Software, Inc., All Rights Reserved.
//
// This code is the exclusive property of Construx Software, Inc. It may ONLY 
// be used by learners during Construx's workshops or by individuals who are 
// being coached by Construx on a project.
//
// This code may NOT be copied or used for any other purpose without the prior
// written consent of Construx Software, Inc.
// ****************************************************************************

package com.construx.developertesting.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This testcase class implements the test cases recommended in Myers'
 * "The Art of Software Testing" for the classic triangle problem.
 * 
 * @author melvinperez
 * 
 */
public class TriangleTypeTest {

    /**
     * 1. Do you have a test case that represents a valid scalene triangle?
     * (Note that test cases such as 1, 2, 3 and 2, 5, 10 do not warrant a "yes"
     * answer because there does not exist a triangle having these dimensions.)
     */
    @Test
    public void classify_aTriangleWithThreeDifferentSidelenghts_asScalene() {
        assertEquals(TriangleType.SCALENE, TriangleType.classify(3, 4, 5));
    }

    /**
     * 2. Do you have a test case that represents a valid equilateral triangle?
     */
    @Test
    public void classify_aTriangleWithThreeEqualSidelengths_asEquilateral() {
        assertEquals(TriangleType.EQUILATERAL, TriangleType.classify(3, 3, 3));
    }

    /**
     * 3. Do you have a test case that represents a valid isosceles triangle?
     * (Note that a test case representing 2, 2, 4 would not count because it is
     * not a valid triangle.)
     * 
     * 4. Do you have at least three test cases that represent valid isosceles
     * triangles such that you have tried all three permutations of two equal
     * sides (such as 3, 3, 4; 3, 4, 3; and 4, 3, 3)?
     */
    @Test
    public void classify_aTriangleWithTwoEqualSidelenghts_asIsosceles() {
        assertEquals(TriangleType.ISOSCELES, TriangleType.classify(3, 3, 4));
        assertEquals(TriangleType.ISOSCELES, TriangleType.classify(3, 4, 3));
        assertEquals(TriangleType.ISOSCELES, TriangleType.classify(4, 3, 3));
    }

    /**
     * 5. Do you have a test case in which one side has a zero value?
     * 
     * 6. Do you have a test case in which one side has a negative value?
     * 
     * 11. Do you have a test case in which all sides are 0 (0, 0, 0)?
     */
    @Test
    public void classify_aTriangleWithSidelengthsNotGreaterThanZero_asInvalid() {
        assertEquals(TriangleType.INVALID, TriangleType.classify(0, 4, 5));
        assertEquals(TriangleType.INVALID, TriangleType.classify(-1, 4, 5));
        assertEquals(TriangleType.INVALID, TriangleType.classify(0, 0, 0));
    }

    /**
     * 7. Do you have a test case with three integers greater than zero such
     * that the sum of two of the numbers is equal to the third? (That is, if
     * the program said that 1, 2, 3 represents a scalene triangle, it would
     * contain a bug.)
     * 
     * 8. Do you have at least three test cases in category 7 such that you have
     * tried all three permutations?
     */
    @Test
    public void classify_aTriangleWithTheSumOfTwoSidelengthsEqualToTheThird_asInvalid() {
        assertEquals(TriangleType.INVALID, TriangleType.classify(1, 2, 3));
        assertEquals(TriangleType.INVALID, TriangleType.classify(2, 3, 1));
        assertEquals(TriangleType.INVALID, TriangleType.classify(3, 2, 1));
    }

    /**
     * 9. Do you have a test case with three integers greater than zero such
     * that the sum of two of the numbers is less than the third (1, 2, 4 or 12,
     * 15, 30)?
     * 
     * 10. Do you have at least three test cases in category 9 such that you
     * have tried all three permutations (for example, 1, 2, 4; 1, 4, 2; and 4,
     * 1, 2)?
     */
    @Test
    public void classify_aTriangleWithTheSumOfTwoSidelenghtsLessThanTheThird_asInvalid() {
        assertEquals(TriangleType.INVALID, TriangleType.classify(1, 2, 4));
        assertEquals(TriangleType.INVALID, TriangleType.classify(1, 4, 2));
        assertEquals(TriangleType.INVALID, TriangleType.classify(4, 1, 2));
    }
}
