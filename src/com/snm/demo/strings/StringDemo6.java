/*
Write a Java program to divide a string in n equal parts.
 */
package com.snm.demo.strings;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scan.nextLine();
        System.out.println("Enter n of parts to split: ");
        int n = scan.nextInt();
        splitString(str, n);

    }

    private static void splitString(String str, int n) {
        int len = str.length();
        int totalPart;
        if (len % n != 0) {
            System.out.println("Can not divide by "+ n);
            return;
        }
        totalPart = len / n;
        for (int i = 0; i < len; i++) {
            if(i % totalPart == 0) {
                System.out.println();
            }
            System.out.print(str.charAt(i));

        }

    }
}
