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

public class Stack {
    // Implements a simple bounded stack of type float

    public static final int CAPACITY = 100;
    private int index; // pointer to the next free entry
    private float entries[] = new float[CAPACITY]; // the stack entries

    public Stack() {
        // constructor -- initializes the stack to an empty state
        index = 0;
    }

    public boolean isEmpty() {
        return (index == 0);
    }

    public float pop() {
        // removes the top entry if pop was successful; returns the value, NaN
        // otherwise (empty)
        if (index > 0) {
            index--;
            return entries[index];
        } else {
            return Float.NaN;
        }
    }

    public boolean push(float entry) {
        // add entry to the top and returns true if successful, false otherwise
        // (stack full)
        if (index < CAPACITY) {
            entries[index] = entry;
            index++;
            return true;
        } else {
            return false;
        }
    }

    public float top() {
        // returns the number if stack is not empty, NaN otherwise
        if (index > 0)
            return entries[index - 1];
        else
            return Float.NaN;
    }
}
