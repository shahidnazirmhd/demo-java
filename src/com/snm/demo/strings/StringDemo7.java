/*
Write a Java program to check if two given strings are rotations of each other.
 */
package com.snm.demo.strings;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = scan.nextLine();
        System.out.println("Enter second string:");
        String str2 = scan.nextLine();
        areRotationOfEachOther(str1, str2);
    }

    private static void areRotationOfEachOther(String str1, String str2) {
        if(str1.length() != str2.length()) {
            System.out.println("String lengths are different, NOT rotations of each other");
            return;
        }
        String str1Twice = str1.concat(str1);
        String str2Twice = str2.concat(str2);
        boolean isRotational = false;
        if(str1Twice.contains(str2)) {
            System.out.println("The 2nd string "+ str2 +" exists in the twice of 1st (New)string.");
            isRotational = true;
        }
        else if(str2Twice.contains(str1)) {
            System.out.println("The 1st string "+ str1 +" exists in the twice of 2nd (New)string.");
            isRotational = true;
        }
        if (isRotational) {
            System.out.println("Strings are rotations of each other");
        } else {
            System.out.println("Strings are  NOT rotations of each other");
        }
    }
}
