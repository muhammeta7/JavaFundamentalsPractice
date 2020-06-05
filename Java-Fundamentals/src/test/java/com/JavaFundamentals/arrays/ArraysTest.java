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
        Integer[] expected1 = {5, 1, 8, 9, 10, 4, 2, 11};
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

    @Test
    public void twoSumTest(){
        int[] input = {2, 7, 11, 15};
        int[] expected = {0, 1};
        int[] actual = arrays.twoSum(input, 9);
        assertArrayEquals(expected, actual);

        int[] input1 = {2, 7, 11, 15};
        int[] expected1 = {2, 3};
        int[] actual1 = arrays.twoSum(input1, 26);
        assertArrayEquals(expected1, actual1);

        int[] input2 = {2, 7, 11, 15};
        int[] expected2 = {1, 2};
        int[] actual2 = arrays.twoSum(input2, 18);
        assertArrayEquals(expected2, actual2);

        int[] input3 = {2, 7, 11, 15, 10};
        int[] expected3 = {1, 2};
        int[] actual3 = arrays.twoSum(input3, 21);
        assertArrayEquals(expected3, actual3);
    }

    @Test
    public void removeDuplicatesLengthTest(){
        int[] input = {1,1,2,2,3,3,4,4};
        int expected = 4;
        int actual = arrays.removeDuplicatesLength(input);
        assertEquals(expected, actual);

        int[] input1 = {1,1,2,3,4,5,5,6};
        int expected1 = 6;
        int actual1 = arrays.removeDuplicatesLength(input1);
        assertEquals(expected1, actual1);

        int[] input2 = {1,1,2,2,3,4,5,6,6,7};
        int expected2 = 7;
        int actual2 = arrays.removeDuplicatesLength(input2);
        assertEquals(expected2, actual2);

        int[] input3 = {0};
        int expected3 = 1;
        int actual3 = arrays.removeDuplicatesLength(input3);
        assertEquals(expected3, actual3);
    }

    @Test
    public void longestCommonPrefixTest(){
        String[] input = {"flower", "flow", "flight"};
        String expected = "fl";
        String actual = arrays.longestCommonPrefix(input);
        assertEquals(expected, actual);

        String[] input1 = {"dog", "racecar", "car"};
        String expected1 = "";
        String actual1 = arrays.longestCommonPrefix(input1);
        assertEquals(expected1, actual1);

        String[] input2 = {"truck", "trunk", "true"};
        String expected2 = "tru";
        String actual2 = arrays.longestCommonPrefix(input2);
        assertEquals(expected2, actual2);

        String[] input3 = {"flower", "flow", "flown"};
        String expected3 = "flow";
        String actual3 = arrays.longestCommonPrefix(input3);
        assertEquals(expected3, actual3);
    }

    @Test
    public void removeElementTest(){
        int[] input = {1,2,3,4,5,2,2};
        int expected = 4;
        int actual = arrays.removeElement(input, 2);
        assertEquals(expected, actual);

        int[] input1 = {1,3,3,4,5,2,5,6};
        int expected1 = 6;
        int actual1 = arrays.removeElement(input1, 3);
        assertEquals(expected1, actual1);

        int[] input2 = {1,2,3,4,5};
        int expected2 = 4;
        int actual2 = arrays.removeElement(input2, 1);
        assertEquals(expected2, actual2);

        int[] input3 = {1,1,1,2,3};
        int expected3 = 2;
        int actual3 = arrays.removeElement(input3, 1);
        assertEquals(expected3, actual3);
    }

    @Test
    public void searchInsertTest(){
        int[] input = {1,3,5,6};
        int expected = 2;
        int actual = arrays.searchInsert(input, 5);
        assertEquals(expected, actual);

        int[] input1 = {1,3,5,6};
        int expected1 = 2;
        int actual1 = arrays.searchInsert(input1, 1);
        assertEquals(expected1, actual1);

        int[] input2 = {1,3,5,6};
        int expected2 = 4;
        int actual2 = arrays.searchInsert(input2, 7);
        assertEquals(expected2, actual2);

        int[] input3 = {1,3,5,6};
        int expected3 = 0;
        int actual3 = arrays.searchInsert(input3, 0);
        assertEquals(expected3, actual3);
    }

    @Test
    public void getMissingNumberTest(){
        int[] input = { 1, 2, 4, 5, 6 };
        int expected = 3;
        int actual = arrays.getMissingNumber(input, 5);
        assertEquals(expected, actual);

        int[] input1 = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        int expected1 = 9;
        int actual1 = arrays.getMissingNumber(input1, 9);
        assertEquals(expected1, actual1);

        int[] input2 = { 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14 };
        int expected2 = 8;
        int actual2 = arrays.getMissingNumber(input2, 13);
        assertEquals(expected2, actual2);

        int[] input3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        int expected3 = 11;
        int actual3 = arrays.getMissingNumber(input3, 11);
        assertEquals(expected3, actual3);
    }

    @Test
    public void convertTo1DArrayTest0(){
        String[][] matrix = {
                {"a", "b", "c"},
                {"d", "e"},
                {"f"},
                {"g", "h", "i", "j"}
        };
        String[] expected = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] actual = arrays.convertTo1DArray(matrix);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void convertTo1DArrayTest1(){
        String[][] matrix = {
                {"a", "b", "c"},
                {"d", "e"},
                {"f"}
        };
        String[] expected = {"a", "b", "c", "d", "e", "f"};
        String[] actual = arrays.convertTo1DArray(matrix);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void convertTo1DArrayTest2(){
        String[][] matrix = {
                {"1", "2", "3"},
                {"4", "5"},
                {"6"},
                {"7", "8", "9", "10"}
        };
        String[] expected = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] actual = arrays.convertTo1DArray(matrix);
        assertArrayEquals(expected, actual);
    }

}
