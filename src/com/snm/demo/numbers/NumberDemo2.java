/*
Prime number or not
 */
package com.snm.demo.numbers;

import java.util.Scanner;

public class NumberDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check the number is prime or not: ");
        long num = scan.nextLong();
        if (num <= 1) {
            System.out.println("The number 1 0r less than 1 are not considered as prime number");
            return;
        }
//        for (long v = 2; v <= num; v++) {
//            System.out.println(v+" is prime: "+isPrime(v));
//        }
        System.out.println(num+" is prime: "+isPrime(num));
    }

    private static boolean isPrime(long num) {
//        if (num <= 1) {
//            return false;
//        }

            for (long i = 2; i*i <= num ; i++) {
                if (num%i == 0) {
                    return false;
                }
            }

        return true;
    }
}
