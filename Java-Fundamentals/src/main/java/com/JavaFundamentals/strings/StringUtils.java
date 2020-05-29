package com.JavaFundamentals.strings;
import java.util.*;

public class StringUtils {

    // param baseValue value to be added to
    // param valueToBeAdded value to add
    // return the concatenation of `baseValue` and `valueToBeAdded`
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    // Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
    // return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
    //If the last word does not exist, return 0.
    public int lengthOfLastWord(String s){
        String[] array = s.split(" ");
        return array.length==0?0:array[array.length-1].length();
    }

    // valueToBeReversed value to be reversed
    // return identical string with characters in opposite order
    public String reverseString(String valueToBeReversed) {
        return new StringBuilder(valueToBeReversed).reverse().toString();
    }

    // Return middle character of word
    public Character getMiddleCharacter(String word) {
        return word.charAt(word.length()/2);
    }

    // param value value to have character removed from
    // param charToRemove character to be removed from `value`
    // return `value` with char of value `charToRemove` removed
    public String removeCharacter(String value, Character charToRemove) {
        String getChar = String.valueOf( charToRemove );
        String modifiedWord = value.replace( getChar, "" );
        return modifiedWord;
    }

    // Given string return last word in sentence
    public String getLastWord(String sentence) {
        String[] array = sentence.split("  ");
        return array[array.length-1];
    }

    // Given a phrase, get the acronym of that phrase. Acronym is the combination of
    // the first character of each word in upper case.
    // For example, given "Ruby on Rails", this method will return "ROR"
    public String acronym(String phrase) {
        String acronym = "";
        String[] words = phrase.split(" ");
        for (String word : words) {
            acronym += word.charAt(0);
        }
        return acronym.toUpperCase();
    }

    // To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
    // intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
    // at the end of the alphabet, it will wraps around.
    public String encrypt(String word) {
        String encrypt = "";
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if ( letter == 'x' || letter == 'y' || letter == 'z') {
                letter -= 26;
            }
            letter += 3;
            encrypt += letter;
        }
        return encrypt;
    }

    // Determine whether 2 strings are anagrams
    // An anagram is a word or phrase formed by rearranging the letters of a
    // different word or phrase, typically using all the original letters exactly once.
    public boolean isAnagram(String input1, String input2){
        String one = input1.toLowerCase();
        String two = input2.toLowerCase();
        if(input1.length() != input2.length()){
            return false;
        }
        int sum = 0;
        for (int i = 0; i < input1.length() ; i++) {
            sum += Math.pow((int)one.charAt(i), 2);
            sum -= Math.pow((int)two.charAt(i), 2);
        }
        return sum == 0;
    }

    // Capitalize Nth Character of String
    public String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String result = "";
        result += str.substring(0, indexToCapitalize) + Character.toUpperCase(str.charAt(indexToCapitalize))+ str.substring(indexToCapitalize+1);
        return result;
    }

    // return true if each Character in string occurs exactly 1 time.
    public Boolean isIsogram(String str) {
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            result.add(str.charAt(i));
        }
        return str.length() == result.size();
    }

    // return true if string contains two identical characters in adjacent indices.
    public Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                return true;
            }
        }
        return false;
    }

    // return near-identical String with each occurrence of duplicate-adjacent characters removed.
    public String removeConsecutiveDuplicateCharacters(String str) {
        String result = "";
        int index = 0;
        for (int i = 1; i < str.length() ; i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                result += str.substring(index, i-1);
                index = 1 + i;
            }
        }
        result += str.substring(index);
        return result;
    }
    // Invert casing of String
    public String invertCasing(String str) {
        String[] arr = str.split("");
        String result = "";
        for (String s : arr){
            System.out.println(s);
            if(Character.isUpperCase(s.charAt(0))){
                result += s.toLowerCase();
            } else{
                result += s.toUpperCase();
            }
        }
        return result;
    }

    // Given: an array of numbers but stored as strings.
    // Task: Sort them in ascending order
    // Example: instead of {9, 8} you have {“9”, “8”, “15”}
    // {“5”, “33333333333333”}
    public String[] stringToIntegerCompare(String[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(array[j].compareTo(array[j+1]) > 0 && array[j].length() == array[j+1].length()){
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                } else if(array[j].length() > array[j+1].length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    // Given: an array of numbers but stored as strings.
    // Task: Sort them in ascending order
    public String[] sortStringOfInts(String[] arr){
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
            }
        });
        return arr;
    }

    // Get all distinct substrings given a String
    public String[] getAllSubstrings(String input){
        List<String> array = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length() ; j++) {
                if(!array.contains(input.substring(i, j))){
                    array.add(input.substring(i, j));
                }
            }
        }
        return array.toArray(new String[0]);
    }

}
