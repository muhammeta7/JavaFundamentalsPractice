package com.JavaFundamentals.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackUtils {
    // Determine if String is balances
    // Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
    // Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
    // A string containing only parentheses is balanced if the following is true: 1.
    // if it is an empty string 2.
    // if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.
    public boolean isBalanced(String input){
        char[] charArray = input.toCharArray();
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('(',')');
        charMap.put('[',']');
        charMap.put('{','}');
        Stack<Character> stack = new Stack<>();
        for(char c : charArray){
            if(charMap.containsKey(c)){
                stack.push(c);
            } else if(stack.empty() || charMap.get(stack.pop()) != c){
                stack.push(c);
                break;
            }
        }
        return stack.empty();
    }
}
