package com.JavaFundamentals.sort;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SortUtilsTest {
    private SortUtils sorter;

    @Before
    public void setup(){
        this.sorter = new SortUtils();
    }

    @Test
    public void bubbleSortTest(){
        int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
        int[] expected1 = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(sorter.bubbleSort(arr1), expected1);

        int[] arr2 = {7,5,2,3,6};
        int[] expected2 = {2,3,5,6,7};
        assertArrayEquals(sorter.bubbleSort(arr2), expected2);

        int[] arr3 = {50,23,27,38,44};
        int[] expected3 = {23,27,38,44,50};
        assertArrayEquals(sorter.bubbleSort(arr3), expected3);
    }

    @Test
    public void insertionSortTest(){
        int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
        int[] expected1 = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(sorter.insertionSort(arr1), expected1);

        int[] arr2 = {7,5,2,3,6};
        int[] expected2 = {2,3,5,6,7};
        assertArrayEquals(sorter.insertionSort(arr2), expected2);

        int[] arr3 = {50,23,27,38,44};
        int[] expected3 = {23,27,38,44,50};
        assertArrayEquals(sorter.insertionSort(arr3), expected3);
    }

    @Test
    public void binarySearchTest(){
        int[] expected1 = {1,2,3,4,5,6,7,8,9,10};
        int[] expected2 = {2,3,5,6,7};
        int[] expected3 = {23,27,38,44,50};

        assertEquals(sorter.binarySearch(expected1, 3), 2);
        assertEquals(sorter.binarySearch(expected2, 6), 3);
        assertEquals(sorter.binarySearch(expected3, 27), 1);
    }
}
