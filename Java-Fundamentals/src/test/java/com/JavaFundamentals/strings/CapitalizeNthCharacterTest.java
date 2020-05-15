package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CapitalizeNthCharacterTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test1() {
        // given
        String input = "hello";
        String expected = "Hello";
        Integer indexToCapitalize = 0;

        // when
        String actual = StringUtils.capitalizeNthCharacter(input, indexToCapitalize);

        // them
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "hello";
        String expected = "hEllo";
        Integer indexToCapitalize = 1;

        // when
        String actual = StringUtils.capitalizeNthCharacter(input, indexToCapitalize);

        // them
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        String input = "hello";
        String expected = "heLlo";
        Integer indexToCapitalize = 2;

        // when
        String actual = StringUtils.capitalizeNthCharacter(input, indexToCapitalize);

        // them
        assertEquals(expected, actual);
    }

}
