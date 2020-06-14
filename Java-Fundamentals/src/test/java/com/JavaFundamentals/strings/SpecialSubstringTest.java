package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SpecialSubstringTest {
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
}
