package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MiddleCharacterTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test1(){
        //Given
        String word = "Aggadah";
        char expected = 'a';

        //When
        char actual = stringUtils.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        //Given
        String word = "information";
        char expected = 'm';

        //When
        char actual = stringUtils.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        //Given
        String word = "reification";
        char expected = 'c';

        //When
        char actual = stringUtils.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }


    @Test
    public void test4(){
        //Given
        String word = "ohm";
        char expected = 'h';

        //When
        char actual = stringUtils.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }
}
