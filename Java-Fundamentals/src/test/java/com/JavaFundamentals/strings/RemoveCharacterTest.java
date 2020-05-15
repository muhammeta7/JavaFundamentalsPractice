package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RemoveCharacterTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test0(){
        // Given
        String word = "melatonin";
        String expected = "melatnin";
        char charToRemove = 'o';

        //When
        String actual = stringUtils.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test1(){
        // Given
        String word = "tryptophan";
        String expected = "rypophan";
        char charToRemove = 't';

        //When
        String actual = stringUtils.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        // Given
        String word = "hydroxytryptamine";
        String expected = "hydroytryptamine";
        char charToRemove = 'x';

        //When
        String actual = stringUtils.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        // Given
        String word = "diethyl";
        String expected = "diethl";
        char charToRemove = 'y';

        //When
        String actual = stringUtils.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        // Given
        String word = "methyl";
        String expected = "ethyl";
        char charToRemove = 'm';

        //When
        String actual = stringUtils.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

}
