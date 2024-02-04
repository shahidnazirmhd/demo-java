/*
Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
 */
package com.snm.demo.strings;

import java.util.Scanner;

public class StringDemo2 {
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
            System.out.println("First String is smaller");
        } else {
            System.out.println("First String is larger");
        }


    }

    private static int compare(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        for(int i = 0; i < minLength; i++) {
            int result = Character.compare(str1.charAt(i), str2.charAt(i));
            if(result != 0){
                return result;
            }
        }
        return Integer.compare(str1.length(), str2.length());
    }
}
