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
        return 0;
    }

}
