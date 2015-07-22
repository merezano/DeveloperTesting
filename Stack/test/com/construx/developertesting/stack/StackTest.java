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
package com.construx.developertesting.stack;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


/**
 * Complete the implementation of the Test Methods below by assigning a
 * meaningful name to each test method and writing its test code.
 */
public class StackTest {
    Stack stack;

    @Before
    public void setup() {
        stack = new Stack(); // All tests start with an empty stack
    }

    // Utility method to fill the stack up to its capacity
    private void fillItUp() {
        for (int i = 0; i < 10; i++)
            stack.push(i);
    }

    // TODO: Ensure the stack is empty when created
    @Test
    public void testName0() {
        // Setup

        // Exercise

        // Verify
        fail("Not yet implemented");
    }

    // TODO: Ensure an entry can be added if the stack is not full
    @Test
    public void testName1() {
        // Setup

        // Exercise

        // Verify
        fail("Not yet implemented");
    }

    // TODO: Ensure the stack does not overflow
    @Test
    public void testName2() {
        // Setup

        // Exercise

        // Verify
        fail("Not yet implemented");
    }

    // TODO: Ensure the top can be removed if the stack is not empty
    @Test
    public void testName3() {
        // Setup

        // Exercise

        // Verify
        fail("Not yet implemented");
    }

    // TODO: Ensure the stack does not underflow
    @Test
    public void testName4() {
        // Setup

        // Exercise

        // Verify
        fail("Not yet implemented");
    }
}