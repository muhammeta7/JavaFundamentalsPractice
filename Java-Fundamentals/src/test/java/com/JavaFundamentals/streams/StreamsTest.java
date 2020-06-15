package com.JavaFundamentals.streams;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StreamsTest {
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
}
