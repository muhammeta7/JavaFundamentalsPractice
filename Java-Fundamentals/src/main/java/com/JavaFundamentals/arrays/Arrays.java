package com.JavaFundamentals.arrays;

import java.lang.reflect.Array;

public class Arrays {
    // Merge 2 arrays
    public Integer[] mergeArrays(Integer[] array1, Integer[] array2){
        Integer[] merged = new Integer[array1.length + array2.length];
        int index = 0;
        for(Integer i : array1){
            merged[index] = i;
            index++;
        }
        for(Integer i : array2){
            merged[index] = i;
            index++;
        }
        return merged;
    }

    //  Given an array and a number, rotate the content to the left as many times as the number given.
    //  Return the new rotated array. For example, given Integer[] array = {5, 4, 2, 18};,
    //  calling arrays.rotate(array, 2); will move the first two
    //  numbers to the back so the returning array looks like this: {2, 18, 5, 4}.
    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    // Count the number of occurrences in 2 arrays
    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    // Most common integer
    public Integer mostCommon(Integer[] array) {
        return null;
    }

    // Given array of integers and squared values
    // Determine if inputArray[i] = squaredValues[j]
    public Boolean compareSquareArray(Integer[] inputArray, Integer[] squaredValues) {
        return null;
    }

    // Return range between 2 closest numbers
    public Integer rangeClosestNumbers(Integer[] array){
        return 0;
    }

}
