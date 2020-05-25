package com.JavaFundamentals.sort;

public class SortUtils {
    // Sort array return ints in ascending order
    public int[] bubbleSort(int[] array){
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n ; i++) {
            swapped = false;
            for (int j = 0; j < n-1-i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return array;
    }

    // Sort array return ints in ascending order
    public int[] insertionSort(int[] array){
        return null;
    }

    // Return index of num in sorted array
    public int binarySearch(int[] array, int num){
        return 0;
    }

    // Merge sort
    public int[] mergeSort(int[] array){
        return null;
    }


}
