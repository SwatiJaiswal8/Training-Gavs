package com.demo.Sampleapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class CalculateTest {
    private Calculate cObj;

    @BeforeAll
    public void setup() {
        cObj = new Calculate();
    }

    @Test
    public void testAddNums() {
        assertEquals(15, cObj.addNums(7, 8));
    }

    @Test
    public void testIsOdd() {
        assertTrue(cObj.odd(7));
    }

    @Test
    public void testIsEven() {
        assertTrue(cObj.isEven(8));
    }
}
