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

/**
 * Solution key for the triangle problem in Myers'
 * "The Art of Software Testing".
 * 
 * @author melvinperez
 * 
 */
public enum TriangleType {
    INVALID, SCALENE, EQUILATERAL, ISOSCELES;

    /**
     * This method take @param three values representing the lengths of the
     * sides of a triangle and @return the type of triangle they would form.
     */
    public static TriangleType classify(final int a, final int b, final int c) {
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
