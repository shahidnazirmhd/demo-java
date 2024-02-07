/*
Write a Java program to read two strings append them together and return the result. If the strings are
different lengths, remove characters from the beginning of the longer string and make them equal length.
 */
package com.snm.demo.strings;


import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String str1 = scan.nextLine();
        System.out.println("Enter Second String : ");
        String str2 = scan.nextLine();
        System.out.println("Altered String: "+ concateWithEqualLength(str1, str2));
    }

    private static String concateWithEqualLength(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 > len2) {
            str1 = str1.substring(len1 - len2);
        } else if (len2 > len1) {
            str2 = str1.substring(len2 - len1);
        }

        return str1 + str2;
    }
}
