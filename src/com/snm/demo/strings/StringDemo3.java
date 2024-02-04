/*
Write a Java program to compare two strings lexicographically, ignoring case differences
*/
package com.snm.demo.strings;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First string: ");
        String str1 = scan.nextLine();
        System.out.println("Enter your Second string: ");
        String str2 = scan.nextLine();
        int result = compare(str1, str2);

        if (result == 0) {
            System.out.println("Two strings are equal");
        } else if(result < 0) {
            System.out.println("First string is smaller than second string");
        } else {
            System.out.println("First string is larger than second string");
        }


    }

    private static int compare(String str1, String str2) {
        String lStr1 = str1.toLowerCase();
        String lStr2 = str2.toLowerCase();
        int minLength = Math.min(lStr1.length(), lStr2.length());

        for(int i = 0; i < minLength; i++) {
            int result = Character.compare(lStr1.charAt(i), lStr2.charAt(i));
            if(result != 0){
                return result;
            }
        }
        return Integer.compare(lStr1.length(), lStr2.length());
    }
}
