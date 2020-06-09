package com.JavaFundamentals.integer;

public class IntegerUtils {

    // Return Factorial of n
    public int factorial(int n){
        int total = 1;
        for (int i = 2; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    // Return whether number is prime
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // return fibonacci number for given n
    public int fibonacci(int n){
        int[] fib = new int[n+2];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }

    // return fibonacci number given n using recursive
    public int fibonacciRecursive(int n){
        if(n <= 1){
            return n;
        }
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }

    // Reverse an integer
    public int reverseInt(int input){
        int rev = 0;
        while( input > 0){
            rev = rev * 10 + input % 10;
            input /= 10;
        }
        return rev;
    }

    // Given two integers moeDaily and hanDaily
    // and an integer difference as the number of days moe started with.
    // Return the amount of days it would take Han to surpass Moe in days studied
    // If its not possible return -1
    // Example: moeDaily = 3, hanDaily = 4, and difference = 2 would return 3 days
    // day0: moe = 2 | han = 0
    // day1: moe = 5 | han = 4
    // day2: moe = 8 | han = 8
    // day3: moe = 11 | han = 12
    public int friendlyCompetition(int moeDaily, int hanDaily, int difference){
        return 0;
    }

}
