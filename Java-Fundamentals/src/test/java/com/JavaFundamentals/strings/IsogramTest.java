package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class IsogramTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test1() {
        String input = "XX";
        assertFalse(stringUtils.isIsogram(input));
    }

    @Test
    public void test2() {
        String input = "XXX";
        assertFalse(stringUtils.isIsogram(input));
    }

    @Test
    public void test3() {
        String input = "AA";
        assertFalse(stringUtils.isIsogram(input));
    }

    @Test
    public void test4() {
        String input = "AAA";
        assertFalse(stringUtils.isIsogram(input));
    }


    @Test
    public void test5() {
        String input = "Here";
        assertFalse(stringUtils.isIsogram(input));
    }

    @Test
    public void test6() {
        String input = "Teared";
        assertFalse(stringUtils.isIsogram(input));
    }

    @Test
    public void test7() {
        String input = "Brown Fox";
        assertFalse(stringUtils.isIsogram(input));
    }

    @Test
    public void test8() {
        String input = "Jump";
        assertTrue(stringUtils.isIsogram(input));
    }

    @Test
    public void test9() {
        String input = "Jj";
        assertTrue(stringUtils.isIsogram(input));
    }

    @Test
    public void test10() {
        String input = "Jj0Oo";
        assertTrue(stringUtils.isIsogram(input));
    }


    @Test
    public void test11() {
        String input = "The Quick";
        assertTrue(stringUtils.isIsogram(input));
    }

    @Test
    public void test12() {
        String input = "Brown";
        assertTrue(stringUtils.isIsogram(input));
    }

}
