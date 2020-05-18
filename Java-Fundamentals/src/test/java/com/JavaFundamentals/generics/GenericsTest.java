package com.JavaFundamentals.generics;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GenericsTest<T extends Comparable<? super T>> {
    private Generics generics;

    @Before
    public void setup(){
        this.generics = new Generics();
    }

    @Test
    public void bubbleSortStringTest(){
        String[] arrayOfStrings = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
        String[] expected = {"Andree", "Azucena", "Blair", "Cami", "Chara", "Demetrice", "Ernestine", "Faviola", "Jamila", "Kareen", "Leana", "Loyce", "Milo", "Monty", "Nelda", "Quincy", "Rene", "Tara", "Toccara", "Winifred"};
        String[] actual = (String[]) generics.bubbleSort(arrayOfStrings);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bubbleSortIntTest(){
        Integer[] intArray = {4,6,1,2,7,8};
        Integer[] expected = {1,2,4,6,7,8};
        Integer[] actual = (Integer[]) generics.bubbleSort(intArray);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bubbleSortDoubleTest(){
        Double[] doubles = {1.51, 1.23, 1.35, .32, .56};
        Double[] expected = {.32, .56, 1.23, 1.35, 1.51};
        Double[] actual = (Double[]) generics.bubbleSort(doubles);
        assertArrayEquals(expected, actual);
    }
}
