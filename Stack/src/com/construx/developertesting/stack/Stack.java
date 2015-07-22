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

/**
 * This class implements a simple bounded (to 10 entries) stack of type float
 */
public class Stack {
    private int index; // pointer to the next free entry
    private float entries[] = new float[10];

    public Stack() {
        index = 0;
    }

    public boolean isEmpty() {
        return (index == 0);
    }

    public float pop() {
        if (index > 0) {
            index--;
            return entries[index];
        } else {
            return Float.NaN;
        }
    }

    public boolean push(float entry) {
        if (index < 10) {
            entries[index] = entry;
            index++;
            return true;
        } else {
            return false;
        }
    }

    public float top() {
        if (index > 0)
            return entries[index - 1];
        else
            return Float.NaN;
    }
}
