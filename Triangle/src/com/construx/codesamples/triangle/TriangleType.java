/*******************************************************************************
 * Copyright (c) 2017, Construx Software, Inc., All Rights Reserved.
 * 
 * This code is the exclusive property of Construx Software, Inc. and it may ONLY 
 * be used by individuals who are being trained and coached by Construx Software, Inc..
 * 
 * This code may NOT be copied or used for any other purpose without the prior
 * written consent of Construx Software, Inc.
 ******************************************************************************/
package com.construx.codesamples.triangle;

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
        if (sidesFormATriangle(a, b, c))
            if (allSidesAreEqual(a, b, c))
                return EQUILATERAL;
            else if (twoSidesAreEqual(a, b, c))
                return ISOSCELES;
            else
                return SCALENE;
        else
            return INVALID;
    }

    private static boolean twoSidesAreEqual(int a, int b, int c) {
        return a == b || b == c || c == a;
    }

    private static boolean allSidesAreEqual(int a, int b, int c) {
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
    private static boolean sidesFormATriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
