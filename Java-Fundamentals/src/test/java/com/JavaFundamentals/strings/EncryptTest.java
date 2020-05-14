package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EncryptTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void testEncryptWithTheFirstAlphabet(){
        //Given
        String word = "apple";
        String expected = "dssoh";

        //When
        String actual = stringUtils.encrypt(word);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testEncryptWithTheLastLetters() {
        //Given
        String word = "wxyz";
        String expected = "zabc";

        //When
        String actual = stringUtils.encrypt(word);

        //Then
        assertEquals(expected, actual);
    }
}
