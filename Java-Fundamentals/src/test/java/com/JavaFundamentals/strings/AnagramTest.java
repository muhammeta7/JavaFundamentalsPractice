package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AnagramTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test0(){
        String input1 = "Ahelot";
        String input2 = "tlehoA";
        assertTrue(stringUtils.isAnagram(input1, input2));
    }

    @Test
    public void test1(){
        String input1 = "anagram";
        String input2 = "margana";
        assertTrue(stringUtils.isAnagram(input1, input2));
    }

    @Test
    public void test2(){
        String input1 = "Hello";
        String input2 = "whatsUp";
        assertFalse(stringUtils.isAnagram(input1, input2));
    }

    @Test
    public void test4(){
        String input1 = "ZipCode";
        String input2 = "Bootcamp";
        assertFalse(stringUtils.isAnagram(input1, input2));
    }
}
