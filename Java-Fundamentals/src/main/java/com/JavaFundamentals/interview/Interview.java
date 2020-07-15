package com.JavaFundamentals.interview;

public class Interview {

    // Arrays
    // Find the missing number in a given integer array of 1 to any number?
    public int findMissingNumber(int[] array){
        int i, total;
        total = (array.length + 1) * (array.length + 2) / 2;
        for (i = 0; i < array.length; i++)
            total -= array[i];
        return total;
    }

    // Find the duplicate number on a given integer array
    public int findDuplicate(int[] array){
        return 0;
    }
    // Find the largest and smallest number in an unsorted integer array
    public int[] largestAndSmallest(int[] unsortedArray){
        return null;
    }

    // Find all pairs of an integer array whose sum is equal to a given number
    public int[] pairForSum(int[] array, int sum){
        return null;
    }
    // Find duplicate numbers in an array if it contains multiple duplicates
    public int[] containsMultipleDuplicates(int[] array){
        return null;
    }

    // Remove duplicates from a given array in Java?
    public int[] removeDuplicates(int[] array){
        return null;
    }

    // Sort integer array in place using quicksort algorithm
    public int[] quickSort(int[] array){
        return null;
    }

    // Remove duplicates from an array in place
    public int[] removeDuplicatesInPlace(int[] array){
        return null;
    }
    // Reverse an array in place
    public int[] reverseArrayInPlace(int[] array){
        return null;
    }
    // Remove duplicates from array without using any libraries
    public int[] removeDuplicatesWithoutLibs(int[] array){
        return null;
    }

}
