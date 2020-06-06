package com.JavaFundamentals.maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    // Given List of Anagrams and non anagram values.
    // For each list return a new list that only returns the first instance of an anagram
    // Return the list in alphabetical order
    public List<String> uniqueAnagrams(List<String> text){
        return null;
    }

    public static int numericalValue(String input){
        char[] array = input.toCharArray();
        int total = 0;
        for(char c: array){
            total += Math.pow((int)c, 2);
        }
        return total;
    }
}
