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
package com.construx.developertesting.stack.refactored;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
    Stack stack = new Stack();

    @Before
    public void setup() {
        stack = new Stack();
    }

    @Test
    public void isEmptyWhenCreated() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void addsEntryIfStackIsNotFull() {
        final int aEntry = 101;
        assertTrue(stack.push(aEntry));
        assertEquals(aEntry, stack.top(), 0);
    }

    @Test
    public void doesNotAddEntryIfStackIsFull() {
        fillItUp();
        assertFalse(stack.isEmpty());
        assertFalse(stack.push(100));
    }

    private void fillItUp() {
        for (int i = 0; i < Stack.CAPACITY; i++)
            stack.push(i);
    }

    @Test
    public void removesTopElementIfStackIsNotEmpty() {
        if (stack.push(100)) {
            assertFalse(stack.isEmpty());
            assertEquals(100, stack.pop(), 0);
            assertTrue(stack.isEmpty());
        }
    }

    @Test
    public void doesNotUnderflowIfStackIsEmpty() {
        if (stack.isEmpty())
            assertEquals(Float.NaN, stack.pop(), 0);
    }

    @Test
    public void returnsNothingIfStackIsEmpty() {
        assertEquals(Float.NaN, stack.top(), 0);
    }

}
