package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SpecialSubstringsTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test0(){
        String input = "mnonopoo";
        long expected = 12;
        long actual = stringUtils.specialSubstringCount(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test1(){
        String input = "asasd";
        long expected = 7;
        long actual = stringUtils.specialSubstringCount(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        String input = "abcbaba";
        long expected = 10;
        long actual = stringUtils.specialSubstringCount(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        String input = "aaaa";
        long expected = 10;
        long actual = stringUtils.specialSubstringCount(input);
        assertEquals(expected, actual);
    }
}
