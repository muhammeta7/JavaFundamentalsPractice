package com.JavaFundamentals.integer;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class IntegerUtilsTest {
    private IntegerUtils integerUtils;

    @Before
    public void setup(){
        this.integerUtils = new IntegerUtils();
    }

    @Test
    public void factorialTest(){
        assertEquals(1, integerUtils.factorial(1));
        assertEquals(6, integerUtils.factorial(3));
        assertEquals(720, integerUtils.factorial(6));
    }

    @Test
    public void isPrimeTest(){
        assertTrue(integerUtils.isPrime(3));
        assertTrue(integerUtils.isPrime(19));
        assertTrue(integerUtils.isPrime(37));
        assertFalse(integerUtils.isPrime(0));
        assertFalse(integerUtils.isPrime(100));
        assertFalse(integerUtils.isPrime(250));
    }


}