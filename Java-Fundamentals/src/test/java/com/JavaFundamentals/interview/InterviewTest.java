package com.JavaFundamentals.interview;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InterviewTest {
    private Interview interview;

    @Before
    public void setup(){
        this.interview = new Interview();
    }

    @Test
    public void findMissingNumberTest0(){
        int[] input = {1, 2, 3, 4, 5, 7};
        int expected = 6;
        int actual = interview.findMissingNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void findMissingNumberTest1(){
        int[] input = {6, 1, 5, 4, 2, 8, 3};
        int expected = 7;
        int actual = interview.findMissingNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void findMissingNumberTest2(){
        int[] input = {6, 1, 5, 4, 2, 8, 7, 3, 10};
        int expected = 9;
        int actual = interview.findMissingNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void findDuplicateTest0(){
        Integer[] input = {1, 2, 3, 4, 5, 6, 1};
        int expected = 1;
        int actual = interview.findDuplicate(input);
        assertEquals(expected, actual);
    }

    @Test
    public void findDuplicateTest1(){
        Integer[] input = {2, 3, 4, 5, 5, 6, 7, 8, 9};
        int expected = 5;
        int actual = interview.findDuplicate(input);
        assertEquals(expected, actual);
    }

    @Test
    public void findDuplicateTest2(){
        Integer[] input = {10, 2, 3, 4, 5, 6, 7, 10};
        int expected = 10;
        int actual = interview.findDuplicate(input);
        assertEquals(expected, actual);
    }


}
