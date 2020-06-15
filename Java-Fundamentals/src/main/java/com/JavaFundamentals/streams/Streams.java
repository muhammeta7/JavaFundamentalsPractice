package com.JavaFundamentals.streams;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    // Return minimum number of deletions to make two strings anagrams
    // String contain only lowercase letters
    public int makingAnagrams(String one, String two){
        int [] letters =  new int[26];
        one.chars().forEach( c -> { letters[c-'a']++; });
        two.chars().forEach( c -> { letters[c-'a']--; });
        return IntStream.of(letters).map(i -> Math.abs(i)).sum();
    }

    // Given a list of strings, write a method that returns a list of all strings
    // that start with the letter 'a' (lower case) and have exactly 3 letters.
    public List<String> length3AndStartsWithA(List<String> input) {
        return input.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

    // Write a method that returns a comma-separated string based on a given list of integers.
    // Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o'
    // if the number is odd. For example, if the input list is (3,44), the output should be 'o3,e44'.
    public String evenOrOdd(List<Integer> input){
        return null;
    }
}
