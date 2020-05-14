package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ReverseTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test0() {
        // Given
        String input = "Smartdust";
        String expected = "tsudtramS";

        // when
        String actual = stringUtils.reverseString(input);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        // Given
        String input = "5HT";
        String expected = "TH5";

        // when
        String actual = stringUtils.reverseString(input);

        // then
        assertEquals(expected, actual);
    }


    @Test
    public void test2() {
        // Given
        String input = "Electrogavitics";
        String expected = "scitivagortcelE";

        // when
        String actual = stringUtils.reverseString(input);

        // then
        assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        // Given
        String input = "Manipura";
        String expected = "arupinaM";

        // when
        String actual = stringUtils.reverseString(input);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        // Given
        String input = "Negentropy";
        String expected = "yportnegeN";

        // when
        String actual = stringUtils.reverseString(input);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseOfReverse1() {
        // Given
        String input = "Kundalini";
        String expected = "iniladnuK";

        // when
        String actual = stringUtils.reverseString(input);

        // then
        assertEquals(expected, actual);
    }


    @Test
    public void testReverseOfReverse2() {
        // Given
        String input = "Demiurge";
        String expected = "egruimeD";

        // when
        String actual = stringUtils.reverseString(input);

        // then
        assertEquals(expected, actual);
    }
}
