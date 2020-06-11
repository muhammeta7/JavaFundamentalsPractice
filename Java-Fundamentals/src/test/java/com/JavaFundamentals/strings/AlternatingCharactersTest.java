package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;;

public class AlternatingCharactersTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test0(){
        String input = "AAAA";
        int expected = 3;
        int actual = stringUtils.alternatingCharacters(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test1(){
        String input = "BBBBB";
        int expected = 4;
        int actual = stringUtils.alternatingCharacters(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        String input = "ABABABAB";
        int expected = 0;
        int actual = stringUtils.alternatingCharacters(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        String input = "ABAABA";
        int expected = 1;
        int actual = stringUtils.alternatingCharacters(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        String input = "AAABBB";
        int expected = 4;
        int actual = stringUtils.alternatingCharacters(input);
        assertEquals(expected, actual);
    }
}
