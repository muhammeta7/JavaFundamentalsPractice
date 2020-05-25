package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SortStringOfIntsTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test0(){
        String[] input = {"3","2","4","10","11","6","5","8","9","7"};
        String[] expected = {"2","3","4","5","6","7","8","9","10","11"};
        String[] actual = stringUtils.sortStringOfInts(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test1(){
        String[] input = {"50","22","4","11","12","6"};
        String[] expected = {"4", "6", "11", "12", "22", "50"};
        String[] actual = stringUtils.sortStringOfInts(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        String[] input = {"100", "50", "150", "300"};
        String[] expected = {"50", "100", "150", "300"};
        String[] actual = stringUtils.sortStringOfInts(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        String[] input = {"5", "4", "3", "2", "1"};
        String[] expected = {"1", "2", "3", "4", "5"};
        String[] actual = stringUtils.sortStringOfInts(input);
        assertArrayEquals(expected, actual);
    }
}
