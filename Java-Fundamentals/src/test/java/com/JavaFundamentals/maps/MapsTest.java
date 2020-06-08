package com.JavaFundamentals.maps;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
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
        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }

        List<String> input1 = Arrays.asList("mars","rams","loan","noal","deco","code", "fish", "animal");
        List<String> expected1 = Arrays.asList("animal","deco","fish","loan","mars");
        List<String> actual1 = maps.uniqueAnagrams(input1);
        for (int i = 0; i < actual1.size(); i++) {
            assertEquals(expected1.get(i), actual1.get(i));
        }
    }

    @Test
    public void inventoryCountTest0(){
        List<String> input = Arrays.asList("item", "item", "item", "item");
        List<String> expected = Arrays.asList("item", "item1", "item2", "item3");
        List<String> actual = maps.inventoryCount(input);
        for (int i = 0; i < input.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void inventoryCountTest1(){
        List<String> input = Arrays.asList("item", "car", "item", "car", "car", "computer", "phone", "phone");
        List<String> expected = Arrays.asList("item", "car", "item1", "car1", "car2", "computer", "phone", "phone1");
        List<String> actual = maps.inventoryCount(input);
        for (int i = 0; i < input.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void inventoryCountTest2(){
        List<String> input = Arrays.asList("item", "car", "item", "car", "phone", "phone", "item");
        List<String> expected = Arrays.asList("item", "car", "item1", "car1", "phone", "phone1", "item2");
        List<String> actual = maps.inventoryCount(input);
        for (int i = 0; i < input.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}
