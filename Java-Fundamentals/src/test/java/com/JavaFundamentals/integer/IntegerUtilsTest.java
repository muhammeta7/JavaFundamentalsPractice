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

    @Test
    public void fibonacciTest(){
        assertEquals(integerUtils.fibonacci(1),1);
        assertEquals(integerUtils.fibonacci(10),55);
        assertEquals(integerUtils.fibonacci(30),832040);
        assertEquals(integerUtils.fibonacci(20),6765);
        assertEquals(integerUtils.fibonacciRecursive(1),1);
        assertEquals(integerUtils.fibonacciRecursive(10),55);
        assertEquals(integerUtils.fibonacciRecursive(30),832040);
        assertEquals(integerUtils.fibonacciRecursive(20),6765);
    }

    @Test
    public void reverseIntTest(){
        int expected = 54321;
        int expected1 = 876;
        int expected2 = 2098;
        int expected3 = 6289;
        int actual = integerUtils.reverseInt(12345);
        int actual1 = integerUtils.reverseInt(678);
        int actual2 = integerUtils.reverseInt(8902);
        int actual3 = integerUtils.reverseInt(9826);
        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }
}
