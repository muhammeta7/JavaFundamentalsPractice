package com.JavaFundamentals.arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import static java.util.Arrays.asList;

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
        Integer[] shifted = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if(i-index < 0){
                shifted[array.length-index+i] = array[i];
            }else{
                shifted[i-index] = array[i];
            }
        }
        return shifted;
    }

    // Count the number of occurrences in 2 arrays
    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;
        for(Integer i : array1){
            if(i == valueToEvaluate){
                counter++;
            }
        }
        for(Integer i : array2){
            if(i == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }

    // Most common integer
    public Integer mostCommon(Integer[] array) {
        Map<Integer, Integer> mostMap = new TreeMap<>();
        int nullCount = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                Integer count = mostMap.get(array[i]);
                if(count == null) {
                    mostMap.put(array[i], 1);
                } else {
                    mostMap.put(array[i], count++);
                }
            }
            else {
                nullCount++;
            }

        }

        Integer maxKey = null;
        int maxValue = 0;

        for(Map.Entry<Integer, Integer> e : mostMap.entrySet()){
            if(e.getValue() >= maxValue){
                maxKey = e.getKey();
                maxValue = e.getValue();
            }
        }
        if(nullCount > maxValue){
            return null;
        }

        return maxKey;
    }

    // Given array of integers and squared values
    // Determine if inputArray[i] = squaredValues[j]
    public Boolean compareSquareArray(Integer[] inputArray, Integer[] squaredValues) {
        ArrayList<Integer> inputSquared = new ArrayList<>(asList(squaredValues));
        for(Integer i : inputArray){
            return inputSquared.contains(i*i);
        }
        return null;
    }

    // Return range between 2 closest numbers
    public Integer rangeClosestNumbers(Integer[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                if(Math.abs(array[i]-array[j]) < min)
                    min = Math.abs(array[i]-array[j]);
            }
        }
        return min;
    }

    // Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return nums;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sumRequired = target - nums[i];
            if(map.containsKey(sumRequired)){
                return new int[]{map.get(sumRequired), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }

    // Given a sorted array nums, remove the duplicates in-place such that each element appear only
    // once and return the new length. Do not allocate extra space for another array,
    // you must do this by modifying the input array in-place with O(1) extra memory.
    public int removeDuplicatesLength(int[] nums){
        int i = 0;
        for(int n : nums)
            if(i < 1 || n > nums[i - 1])
                nums[i++] = n;
        return i;
    }
}
