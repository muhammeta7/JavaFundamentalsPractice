package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class InvertCasingTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test0() {
        String input = "a";
        String expected = "A";
        assertEquals(expected, stringUtils.invertCasing(input));
    }

    @Test
    public void test1() {
        String input = "Z";
        String expected = "z";
        assertEquals(expected, stringUtils.invertCasing(input));
    }

    @Test
    public void test2() {
        String expected = "This one is kind of tricky!";
        assertEquals(expected, stringUtils.invertCasing(expected));

    }

    @Test
    public void test3() {
        String input = "iNcReAsInG";
        String expected = "InCrEaSiNg";
        assertEquals(expected, stringUtils.invertCasing(input));
    }

    @Test
    public void test4() {
        String input = "No Big Deal!";
        String expected = "nO bIG dEAL!";
        assertEquals(expected, stringUtils.invertCasing(input));
    }

    @Test
    public void test5() {
        String expected = "#^@!&*$(%$";
        assertEquals(expected, stringUtils.invertCasing(expected));
    }
}
