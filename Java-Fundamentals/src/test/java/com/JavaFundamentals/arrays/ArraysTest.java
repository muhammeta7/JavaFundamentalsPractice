package com.JavaFundamentals.arrays;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArraysTest {
    private Arrays arrays;

    @Before
    public void setup() {
        this.arrays = new Arrays();
    }

    @Test
    public void mergeArraysTest(){
        Integer[] array1 = {9};
        Integer[] array2 = {6};
        Integer[] expected = {9, 6};
        Integer[] actual = arrays.mergeArrays(array1, array2);
        assertArrayEquals(expected, actual);

        Integer[] array3 = {5, 1, 8, 9, 10};
        Integer[] array4 = {4, 2, 11};
        Integer[] expected1 = {9, 10, 11, 5, 1, 8, 4, 2};
        Integer[] actual1 = arrays.mergeArrays(array3, array4);
        assertArrayEquals(expected1, actual1);
    }

    @Test
    public void testRotateLeft_forOne(){
        //Given
        Integer[] array = {5, 1, 8, 4, 2};
        Integer[] expected = {1, 8, 4, 2, 5};

        //When
        Integer[] actual = arrays.rotate(array, 1);

        //Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRotateLeft_forMoreThanOne(){
        //Given
        Integer[] array = {5, 1, 8, 4, 2};
        Integer[] expected = {4, 2, 5, 1, 8,};

        //When
        Integer[] actual = arrays.rotate(array, 3);

        //Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueDoesNotExist() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 0;
        Integer[] array1 = {1, 6};
        Integer[] array2 = {9, 8, 11};

        // When
        Integer actual = arrays.countOccurrence(array1, array2, valueToEvaluate);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueExistInFirstArray() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 1;
        Integer[] array1 = {1, 6, valueToEvaluate};
        Integer[] array2 = {3};

        // When
        Integer actual = arrays.countOccurrence(array1, array2, valueToEvaluate);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueExistInSecondArray() {
        // Given
        Integer valueToEvaluate = 9;
        Integer expected = 2;
        Integer[] array1 = {1, 6};
        Integer[] array2 = {valueToEvaluate, valueToEvaluate, 3};

        // When
        Integer actual = arrays.countOccurrence(array1, array2, valueToEvaluate);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueAppearsInBoth() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 7;
        Integer[] array1 = {valueToEvaluate, 1, valueToEvaluate, 8, 84, 5, valueToEvaluate, 9, 8, valueToEvaluate};
        Integer[] array2 = {1, valueToEvaluate, valueToEvaluate, 8, 5, valueToEvaluate, 91};

        // When
        Integer actual = arrays.countOccurrence(array1, array2, valueToEvaluate);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testMostCommon_withOnlyOneElement(){
        //Given
        Integer[] array = {5};
        Integer expected = 5;

        //When
        Integer actual = arrays.mostCommon(array);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testMostCommon_withMultipleElements(){
        //Given
        Integer commonValue = 8;
        Integer[] array = {commonValue, 5, 1, 1, commonValue, 5, 5, commonValue, commonValue};

        //When
        Integer actual = arrays.mostCommon(array);

        //Then
        assertEquals(commonValue, actual);
    }

    @Test
    public void compareSquareArray(){
        Integer[] array = {1, 2, 3};
        Integer[] arraySquared = {1, 4, 9};
        assertTrue(arrays.compareSquareArray(array, arraySquared));

        Integer[] array1 = {3, 4, 5};
        Integer[] arraySquared1 = {9, 16, 25};
        assertTrue(arrays.compareSquareArray(array1, arraySquared1));

        Integer[] array2 = {3, 4, 5};
        Integer[] arraySquared2 = {11, 16, 25};
        assertFalse(arrays.compareSquareArray(array2, arraySquared2));
    }

    @Test
    public void rangeClosestNumbersTest1(){
        Integer[] array = {5, 1, 8, 4, 2};
        int expected = 1;
        int actual = arrays.rangeClosestNumbers(array);
        assertEquals(expected, actual);
    }

    @Test
    public void rangeClosestNumbersTest2(){
        Integer[] array = {2, 4, 7, 11, 2};
        int expected = 0;
        int actual = arrays.rangeClosestNumbers(array);
        assertEquals(expected, actual);
    }

    @Test
    public void rangeClosestNumbersTest3(){
        Integer[] array = {2, 4, 7, 11, 23};
        int expected = 2;
        int actual = arrays.rangeClosestNumbers(array);
        assertEquals(expected, actual);
    }
}
