package com.JavaFundamentals.arrays;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Stream;

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
    public Integer[] rotate(Integer[] array, Integer shift) {
        Integer[] newArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            int newLocation = (i + shift) % array.length;
            newArray[i] = array[newLocation];
        }
        return newArray;
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

    // Write a function to find the longest common prefix string amongst an array of strings.
    // If there is no common prefix, return an empty string "".
    public String longestCommonPrefix(String[] strings){
        if(strings.length < 1 || strings == null){
            return "";
        }
        if(strings.length == 1){
            return strings[0];
        }
        // Find shortest string
        int shortest = 0;
        int len = strings[0].length();
        for (int i = 1; i < strings.length; i++) {
            int curLen = strings[i].length();
            if (curLen < len) {
                len = curLen;
                shortest = i;
            }
        }
        // Find the longest common prefix
        String sub = strings[shortest];
        for (int i = 0; i < strings.length; i++) {
            while (strings[i].indexOf(sub) != 0) {
                sub = sub.substring(0, sub.length()-1);
            }
        }
        return sub;
    }

    // Given an array nums and a value val, remove all instances of that value in-place and return the new length.
    // Do not allocate extra space for another array, you must do this by modifying
    // the input array in-place with O(1) extra memory.
    // The order of elements can be changed. It doesn't matter what you leave beyond the new length.
    public int removeElement(int[] nums, int val){
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i] == val){
                nums[i--] = nums[len-- -1];
            }
        }
        return len;
    }

    // Given a sorted array and a target value, return the index if the target is found.
    // If not, return the index where it would be if it were inserted in order.
    // You may assume no duplicates in the array.(Hint: Binary Search)
    public int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }

    // You are given a list of n-1 integers and these integers are in the range of 1 to n.
    // There are no duplicates in the list.
    // One of the integers is missing in the list. Find the missing integer.
    public int getMissingNumber(int[] array, int n){
        int total = 1;
        for (int i = 2; i <= (n + 1); i++) {
            total += i;
            total -= array[i - 2];
        }
        return total;
    }

    // Convert a 2-D array of strings into a 1-D array
    public String[] convertTo1DArray(String[][] matrix){
        String[] result = Stream.of(matrix)
                .flatMap(Stream::of)
                .toArray(String[]::new);
        return result;
    }

    // It's New Year's Day and everyone's in line for the Wonderland roller coaster ride!
    // There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue.
    // Initial positions increment by  from  at the front of the line to  at the back.
    //Any person in the queue can bribe the person directly in front of them to swap positions.
    // If two people swap positions, they still wear the same sticker denoting their original places in line.
    // One person can bribe at most two others. For example, if n = 8 and Person 5 bribes Person 4, the queue will look like this: 1,2,3,4,5,6,7,8.
    // Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!
    // Complete the function minimumBribes in the editor below. It must print an integer representing the minimum number of bribes necessary, or
    // -1 if the line configuration is not possible.
    // minimumBribes has the following parameter(s): an array of ints
    public int minimumBribes(int[] que){
        int numOfBribes = 0;
        int temp = 0;
        // Set boolean to determine if there were any bribes
        boolean bribe = false;
        // Traverse through given array backwards
        for (int i = que.length - 1; i > 0 ; i--) {

            if(que[i] != (i+1) && que[i-1] >= (i+1) && que[i-1]==(i+1)){
                temp = que[i];
                que[i] = que[i-1];
                que[i-1] = temp;
                numOfBribes++;
                bribe = true;
            }
            if(i > 1 && que[i] != (i+1) && que[i-2] >= (i+1) && que[i-2]==(i+1)){
                temp = que[i];
                que[i] = que[i-2];
                que[i-2] = que[i-2];
                que[i-1] = temp;
                numOfBribes = numOfBribes + 2;
                bribe = true;
            }
            if(!bribe && que[i] != (i+1)){
                break;
            }
            bribe = false;
        }

        return numOfBribes;
    }

}
