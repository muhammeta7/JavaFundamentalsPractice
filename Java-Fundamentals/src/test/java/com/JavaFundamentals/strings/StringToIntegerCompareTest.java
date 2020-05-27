package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringToIntegerCompareTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test0(){
        String[] input = {"9", "8", "7"};
        String[] expected = {"7", "8", "9"};
        String[] actual = stringUtils.stringToIntegerCompare(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test1(){
        String[] input = {"5", "3333", "3"};
        String[] expected = {"3", "5", "3333"};
        String[] actual = stringUtils.stringToIntegerCompare(input);
        assertArrayEquals(expected, actual);
    }
}
