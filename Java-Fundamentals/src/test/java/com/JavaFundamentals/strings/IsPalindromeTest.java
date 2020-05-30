package com.JavaFundamentals.strings;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPalindromeTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test0(){
        String input = "anna";
        boolean actual = stringUtils.isPalindrome(input);
        assertTrue(actual);
    }

    @Test
    public void test1(){
        String input = "racecar";
        boolean actual = stringUtils.isPalindrome(input);
        assertTrue(actual);
    }

    @Test
    public void test2(){
        String input = "noon";
        boolean actual = stringUtils.isPalindrome(input);
        assertTrue(actual);
    }

    @Test
    public void test3(){
        String input = "nope";
        boolean actual = stringUtils.isPalindrome(input);
        assertFalse(actual);
    }

    @Test
    public void test4(){
        String input = "palindrome";
        boolean actual = stringUtils.isPalindrome(input);
        assertFalse(actual);
    }

    @Test
    public void test5(){
        String input = "lollipop";
        boolean actual = stringUtils.isPalindrome(input);
        assertFalse(actual);
    }
}
