package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RemoveConsecutiveDuplicateCharactersTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test1() {
        // given
        String input = "Fool";
        String expected = "Fl";
        test(expected, input);
    }

    @Test
    public void test2() {
        // given
        String input = "Mississippi";
        String expected = "Miiii";
        test(expected, input);
    }

    @Test
    public void test3() {
        // given
        String input = "Fleet";
        String expected = "Flt";
        test(expected, input);
    }

    @Test
    public void test4() {
        // given
        String input = "Independence";
        String expected = input;
        test(expected, input);
    }
    @Test
    public void test5() {
        // given
        String input = "Integer";
        String expected = input;
        test(expected, input);
    }

    public void test(String expected, String input) {
        // when
        String actual = stringUtils.removeConsecutiveDuplicateCharacters(input);

        // then
        assertEquals(expected, actual);
    }
}
