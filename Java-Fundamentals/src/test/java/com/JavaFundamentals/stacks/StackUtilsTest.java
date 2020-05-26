package com.JavaFundamentals.stacks;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StackUtilsTest {
    private StackUtils stackUtils;

    @Before
    public void setup(){
        this.stackUtils = new StackUtils();
    }

    @Test
    public void balancedTest(){
        String input = "{}()";
        String input1 = "({()})";
        String input2 = "{}(";
        String input3 = "[]";
        String input4 = "[]{}(){()}((())){{{}}}{()()}{{}{}}";
        String input5 = "))))";
        String input6 = "";

        assertTrue(stackUtils.isBalanced(input));
        assertTrue(stackUtils.isBalanced(input1));
        assertFalse(stackUtils.isBalanced(input2));
        assertTrue(stackUtils.isBalanced(input3));
        assertTrue(stackUtils.isBalanced(input4));
        assertFalse(stackUtils.isBalanced(input5));
        assertTrue(stackUtils.isBalanced(input6));
    }
}
