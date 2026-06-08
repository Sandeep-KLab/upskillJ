package com.upskillJ.c03.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2+2;
        assertEquals(4, answer,"2+2=4" );
    }
}
