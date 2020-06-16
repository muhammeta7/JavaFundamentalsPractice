package com.JavaFundamentals.streams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StreamsTest {
    public Streams streams;

    @Before
    public void setup(){
        this.streams = new Streams();
    }

    @Test
    public void averageTest0(){
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Double expected = 5.5;
        Double actual = streams.average(input);
        assertEquals(expected, actual);
    }

    @Test
    public void averageTest1(){
        List<Integer> input = Arrays.asList(0, 100, 150, 200, 350);
        Double expected = 160.0;
        Double actual = streams.average(input);
        assertEquals(expected, actual);
    }

    @Test
    public void averageTest2(){
        List<Integer> input = Arrays.asList(35, 47, 52, 78);
        Double expected = 53.0;
        Double actual = streams.average(input);
        assertEquals(expected, actual);
    }

    @Test
    public void averageTest3(){
        List<Integer> input = Arrays.asList(50, 55, 60, 70);
        Double expected = 58.75;
        Double actual = streams.average(input);
        assertEquals(expected, actual);
    }

    @Test
    public void makingAnagramsTest0(){
        String one = "cde";
        String two = "abc";
        int expected = 4;
        int actual = streams.makingAnagrams(one, two);
        assertEquals(expected, actual);
    }

    @Test
    public void makingAnagramsTest1(){
        String one = "fcrxzwscanmligyxyvym";
        String two = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        int expected = 30;
        int actual = streams.makingAnagrams(one, two);
        assertEquals(expected, actual);
    }

    @Test
    public void makingAnagramsTest2(){
        String one = "showman";
        String two = "woman";
        int expected = 2;
        int actual = streams.makingAnagrams(one, two);
        assertEquals(expected, actual);
    }

    @Test
    public void length3AndStartsWithATest0(){
        List<String> input = Arrays.asList("ace", "app", "act", "boy", "toy", "chips");
        int expected = 3;
        int actual = streams.length3AndStartsWithA(input).size();
        assertEquals(expected, actual);
    }

    @Test
    public void length3AndStartsWithATest1(){
        List<String> input = Arrays.asList("ace", "app", "act", "ask", "all", "ant");
        int expected = 6;
        int actual = streams.length3AndStartsWithA(input).size();
        assertEquals(expected, actual);
    }

    @Test
    public void length3AndStartsWithATest2(){
        List<String> input = Arrays.asList("bike", "car", "lost", "boy", "toy", "chips");
        int expected = 0;
        int actual = streams.length3AndStartsWithA(input).size();
        assertEquals(expected, actual);
    }

    @Test
    public void length3AndStartsWithATest3(){
        List<String> input = Arrays.asList("ace", "pact", "act", "boy", "toy", "chips", "ant", "all");
        int expected = 4;
        int actual = streams.length3AndStartsWithA(input).size();
        assertEquals(expected, actual);
    }

    @Test
    public void evenOrOddTest0(){
        List<Integer> input = Arrays.asList(2, 3, 4, 6, 7, 8, 10);
        String expected = "2e,3o,4e,6e,7o,8e,10e";
        String actual = streams.evenOrOdd(input);
        assertEquals(expected, actual);
    }

    @Test
    public void evenOrOddTest1(){
        List<Integer> input = Arrays.asList(4, 8, 20, 30);
        String expected = "2e,8e,20e,30e";
        String actual = streams.evenOrOdd(input);
        assertEquals(expected, actual);
    }

    @Test
    public void evenOrOddTest2(){
        List<Integer> input = Arrays.asList(3, 17, 67);
        String expected = "3o,17o,67o";
        String actual = streams.evenOrOdd(input);
        assertEquals(expected, actual);
    }
}
