/*
Java program to find the factorial of a given number:
 */
package com.snm.demo.numbers;

import java.util.Scanner;

public class NumberDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        System.out.println(getFactorial(num));
    }

    private static long getFactorial(int num) {
        if(num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact*=i;
        }

        return fact;
    }
}
