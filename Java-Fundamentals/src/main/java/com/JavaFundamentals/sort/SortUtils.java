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
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i-1;
            while( j >=0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        return array;
    }

    // Return index of num in sorted array
    public int binarySearch(int[] array, int num){
        int l = 0;
        int r = array.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            if(array[m] == num){
                return m;
            } else if(array[m] < num){
                l = m + 1;
            } else {
                r = m -1;
            }
        }
        return -1;
    }

    // Merge sort
    public int[] mergeSort(int[] array){
        return null;
    }


}
