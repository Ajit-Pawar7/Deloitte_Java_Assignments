package com.deloitte.lab1.ex3;

public class Lab1Ex3 {

    public static int fibonacciNonRecursive(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 1, b = 1, c;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; 
        
        System.out.println("The " + n + "th Fibonacci number (non-recursive) is: " + fibonacciNonRecursive(n));

        System.out.println("The " + n + "th Fibonacci number (recursive) is: " + fibonacciRecursive(n));
    }
}
