package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LastWordTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test1(){
        // Given
        String sentence = "We assume chemical evolution is a sufficient explanation.";
        String expected = "explanation.";

        // When
        String actual = stringUtils.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        // Given
        String sentence = "What is meant by 'irreducible complexity'?";
        String expected = "complexity'?";

        // When
        String actual = stringUtils.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        // Given
        String sentence = "quantum information conservation";
        String expected = "conservation";

        // When
        String actual = stringUtils.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        // Given
        String sentence = "The universe yields geometries so elegant, they animate with intelligence.";
        String expected = "intelligence.";

        // When
        String actual = stringUtils.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }
}
