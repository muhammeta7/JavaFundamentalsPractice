package com.JavaFundamentals.maps;
import java.util.*;

public class Maps {
    // Given List of Anagrams and non anagram values.
    // For each list return a new list that only returns the first instance of an anagram
    // Return the list in alphabetical order
    public List<String> uniqueAnagrams(List<String> text){
        List<String> result = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        for(String s : text){
            if(!map.containsKey(numericalValue(s))){
                map.put(numericalValue(s), s);
            }
        }
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        Collections.sort(result);
        return result;
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
