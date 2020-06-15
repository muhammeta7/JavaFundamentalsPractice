package com.JavaFundamentals.streams;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StreamsTest{
    public Streams streams;

    @Before
    public void setup(){
        this.streams = new Streams();
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
}
