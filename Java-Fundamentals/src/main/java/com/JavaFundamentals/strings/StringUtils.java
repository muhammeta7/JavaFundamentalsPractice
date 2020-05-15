package com.JavaFundamentals.strings;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    // param baseValue value to be added to
    // param valueToBeAdded value to add
    // return the concatenation of `baseValue` and `valueToBeAdded`
    public String concatenate(String baseValue, String valueToBeAdded) {
        return null;
    }

    // valueToBeReversed value to be reversed
    // return identical string with characters in opposite order
    public String reverseString(String valueToBeReversed) {
        return null;
    }

    // Return middle character of word
    public Character getMiddleCharacter(String word) {
        return null;
    }

    // param value value to have character removed from
    // param charToRemove character to be removed from `value`
    // return `value` with char of value `charToRemove` removed
    public String removeCharacter(String value, Character charToRemove) {
        return null;
    }

    // Given string return last word in sentence
    public String getLastWord(String sentence) {
        return null;
    }

    // Given a phrase, get the acronym of that phrase. Acronym is the combination of
    // the first character of each word in upper case.
    // For example, given "Ruby on Rails", this method will return "ROR"
    public String acronym(String phrase) {
        return null;
    }

    // To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
    // intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
    // at the end of the alphabet, it will wraps around.
    public String encrypt(String word) {
        return null;
    }

    // Determine whether 2 strings are anagrams
    // An anagram is a word or phrase formed by rearranging the letters of a
    // different word or phrase, typically using all the original letters exactly once.
    public boolean isAnagram(String input1, String input2){
        return false;
    }

    // Given two strings of integers, return the string which is of
    // greater value (no using BigInteger or BigDecimal or parseInt)
    // valueOf not allowed
    public String stringToIntegerCompare(String integer1, String integer2){
        return integer1;
    }

    // Given: an array of numbers but stored as strings.
    // Task: Sort them in ascending order
    public String[] sortStringOfInts(String[] arr){
        return arr;
    }

    // Get all substrings given a String
    public String[] getAllSubstrings(String input){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1 ; j <= input.length() ; j++) {
                result.add(input.substring(i,j));
            }
        }
        return result.toArray(new String[0]);
    }

}
