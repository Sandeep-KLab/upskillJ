package com.upskillJ.c04.otherClasses.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer four = 4;
        assertEquals(4, four.intValue(),"intValue returns int 4");

        Integer five = 5;
        assertEquals(5, five.intValue(),"intValue returns int 5");
    }

    @Test
    public void convertToHexString(){
        Integer eleven = 11;
        assertEquals("b", Integer.toHexString(eleven),"toHexString returns string b");
        Integer ten = 10;
        assertEquals("a", Integer.toHexString(ten),"toHexString returns string a");
        Integer three = 3;
        assertEquals("3", Integer.toHexString(three),"toHexString returns string 3");
        Integer twentyOne = 21;
        assertEquals("15", Integer.toHexString(twentyOne),"toHexString returns string 15");
    }

    @Test
    public void verifyMaxAndMinValuesOfInteger(){
        assertEquals(-2147483648, Integer.MIN_VALUE,"Verify Min value of Integer");

        assertEquals(2147483647, Integer.MAX_VALUE,"Verify Max value of Integer");
    }
}
