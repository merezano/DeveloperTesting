/*******************************************************************************
 * Copyright (c) 2017, Construx Software, Inc., All Rights Reserved.
 * 
 * This code is the exclusive property of Construx Software, Inc. and it may ONLY 
 * be used by individuals who are being trained and coached by Construx Software, Inc..
 * 
 * This code may NOT be copied or used for any other purpose without the prior
 * written consent of Construx Software, Inc.
 ******************************************************************************/
// ***************************************************************************
// Copyright (c) 2016, Construx Software, Inc., All Rights Reserved.
//
// This code is the exclusive property of Construx Software, Inc. 
// It may ONLY be used by learners during Construx's workshops or 
// by individuals who are being coached by Construx on a project.
//
// This code may NOT be copied or used for any other purpose without the prior
// written consent of Construx Software, Inc.
// ****************************************************************************
package com.construx.codesamples.java.triangle;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TriangleTypeTest_DataDriven {
    private int a, b, c;
    private TriangleType expectedTriangle;

    public TriangleTypeTest_DataDriven(int a, int b, int c, TriangleType expectedTriangle) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expectedTriangle = expectedTriangle;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 2, 4, TriangleType.INVALID },
                { 1, 4, 2, TriangleType.INVALID },
                { 4, 1, 2, TriangleType.INVALID },
                { 3, 3, 3, TriangleType.EQUILATERAL },
                { 3, 4, 3, TriangleType.ISOSCELES },
                { 4, 3, 3, TriangleType.ISOSCELES },
                { 3, 3, 4, TriangleType.ISOSCELES },
                { 3, 4, 5, TriangleType.SCALENE }

        });
    }

    @Test
    public void classifyTriangles() {
        assertEquals(expectedTriangle, TriangleType.classify(a, b, c));
    }
}
