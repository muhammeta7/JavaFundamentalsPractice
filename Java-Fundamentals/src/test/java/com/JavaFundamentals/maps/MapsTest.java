package com.JavaFundamentals.maps;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MapsTest {
    private Maps maps;

    @Before
    public void setup(){
        this.maps = new Maps();
    }

    @Test
    public void uniqueAnagramsTest(){
        List<String> input = Arrays.asList("mars", "rams", "deco", "code");
        List<String> expected = Arrays.asList("deco", "mars");
        List<String> actual = maps.uniqueAnagrams(input);
        for (int i = 0; i < expected.size(); i++) {
            for (int j = i; j < actual.size(); j++) {
                assertEquals(expected.get(i), actual.get(j));
            }
        }


        List<String> input1 = Arrays.asList("mars","rams","loan","noal","deco","code", "fish", "animal");
        List<String> expected1 = Arrays.asList("animal","deco","fish","loan","mars");
        List<String> actual1 = maps.uniqueAnagrams(input1);
        for (int i = 0; i < expected1.size(); i++) {
            for (int j = i; j < actual1.size(); j++) {
                assertEquals(expected1.get(i), actual1.get(j));
            }
        }
    }
}
