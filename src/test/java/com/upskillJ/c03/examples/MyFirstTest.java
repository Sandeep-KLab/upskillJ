package com.upskillJ.c03.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2+2;
        assertEquals(4, answer,"2+2=4" );
    }
    @Test
    public void canSubtractTwoMinusTwo() {
        int answer = 2-2;
        assertEquals(0, answer,"2-2=0" );
    }
    @Test
    public void canMultiplyTwoAndTwo() {
        int answer = 2*2;
        assertEquals(4, answer,"2*2=4" );
    }
    @Test
    public void canDivideTwoByTwo() {
        int answer = 2/2;
        assertEquals(1, answer,"2/2=1" );
    }
}
