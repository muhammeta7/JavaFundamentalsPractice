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
    public void findMissingNumberTest(){
        int[] input = {1, 2, 3, 4, 5, 7};
        int expected = 6;
        int actual = interview.findMissingNumber(input);
        assertEquals(expected, actual);
    }
}
