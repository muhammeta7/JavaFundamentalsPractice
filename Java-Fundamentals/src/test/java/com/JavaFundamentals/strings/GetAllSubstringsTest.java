package com.JavaFundamentals.strings;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GetAllSubstringsTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        this.stringUtils = new StringUtils();
    }

    @Test
    public void test0(){
        String[] expected = {"A", "Ap", "App", "Appl", "Apple", "p", "pp", "ppl", "pple", "p", "pl", "ple", "l", "le", "e"};
        String[] actual = stringUtils.getAllSubstrings("Apple");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        // given
        String input = "A";
        String[] expected = {input};

        // when
        String[] actual = stringUtils.getAllSubstrings(input);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "B";
        String[] expected = {input};

        // when
        String[] actual = stringUtils.getAllSubstrings(input);

        // then
        assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        String[] expected = {"A", "AB", "B" };

        // when
        String[] actual = stringUtils.getAllSubstrings("AB");

        // then
        assertArrayEquals(expected, actual);
    }


    @Test
    public void test4() {
        // given
        String input = "ABB";
        String[] expected = {"A", "AB", "ABB", "B", "BB", "B"};

        // when
        String[] actual = stringUtils.getAllSubstrings(input);

        // then
        assertArrayEquals(expected, actual);
    }


    @Test
    public void test5() {
        // given
        String input = "AABB";
        String[] expected = {"A", "AA", "AAB", "AABB","A", "AB", "ABB", "B", "BB", "B"};

        // when
        String[] actual = stringUtils.getAllSubstrings(input);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test6(){
        String[] expected = {"c", "ca", "can", "a", "an", "n"};
        String[] actual = stringUtils.getAllSubstrings("can");
        assertArrayEquals(expected, actual);
    }
}
