/*
Program to Print Fibonacci Series in Java
 */
package com.snm.demo.numbers;

import java.util.Scanner;

public class NumberDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to print fibonacci series: ");
        long num = scan.nextLong();
        fibonacci(num);
    }

    private static void fibonacci(long num) {
        long a=0,b=1;
        System.out.println("Fibonacci Series up to " + num + " terms:");
        for (long i = 0; i < num; i++) {
            System.out.print(a+" ");
            long nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
