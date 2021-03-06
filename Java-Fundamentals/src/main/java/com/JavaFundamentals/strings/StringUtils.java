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

    // Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
    // return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
    //If the last word does not exist, return 0.
    public int lengthOfLastWord(String s){
        return 0;
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

    // Capitalize Nth Character of String
    public String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return null;
    }

    // return true if each Character in string occurs exactly 1 time.
    public Boolean isIsogram(String str) {
        return null;
    }

    // return true if string contains two identical characters in adjacent indices.
    public Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    // return near-identical String with each occurrence of duplicate-adjacent characters removed.
    public String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }
    // Invert casing of String
    public String invertCasing(String str) {
        return null;
    }

    // Given two strings of integers, return the string which is of
    // greater value (no using BigInteger or BigDecimal or parseInt)
    // valueOf not allowed
    public String[] stringToIntegerCompare(String[] input){
        return null;
    }

    // Given: an array of numbers but stored as strings.
    // Task: Sort them in ascending order
    public String[] sortStringOfInts(String[] arr){
        return arr;
    }

    // Get all distinct substrings given a String
    public String[] getAllSubstrings(String input){
        return null;
    }

    // Determine if word is Palindrome
    public boolean isPalindrome(String s){
        return false;
    }

    // Get number of occurrences of word in an array of strings
    public int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    // Given a string containing only characters A and B.
    // Return the number of deletions to return the string with on adjacent matching characters
    public int alternatingCharacters(String s){
        return 0;
    }

    // A string is said to be a special string if either of two conditions is met:
    // All of the characters are the same, e.g. aaa.
    // All characters except the middle one are the same, e.g. aadaa.
    public long specialSubstringCount(String input){
        return 0l;
    }
}
