package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class HasDuplicateConsecutiveCharactersTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test1() {
        String input = "Happy";
        assertTrue(stringUtils.hasDuplicateConsecutiveCharacters(input));
    }

    @Test
    public void test2() {
        String input = "Fool";
        assertTrue(stringUtils.hasDuplicateConsecutiveCharacters(input));
    }

    @Test
    public void test3() {
        String input = "George";
        assertFalse(stringUtils.hasDuplicateConsecutiveCharacters(input));
    }

    @Test
    public void test4() {
        String input = "False";
        assertFalse(stringUtils.hasDuplicateConsecutiveCharacters(input));
    }
}
