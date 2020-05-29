package com.JavaFundamentals.strings;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class LengthOfLastWordTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test0(){
        int expected = 0;
        int actual = stringUtils.lengthOfLastWord("");
        assertEquals(expected, actual);
    }

    @Test
    public void test1(){
        int expected = 5;
        int actual = stringUtils.lengthOfLastWord("Hello World");
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int expected = 2;
        int actual = stringUtils.lengthOfLastWord("There she is");
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int expected = 4;
        int actual = stringUtils.lengthOfLastWord("hahaha this is not cool");
        assertEquals(expected, actual);
    }
}
