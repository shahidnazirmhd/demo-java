/*
Write a Java program to create a new string from a given string by swapping the last two characters of the
given string. The length of the given string must be two or more.
 */
package com.snm.demo.strings;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String (String must contains two characters): ");
        String str = scan.nextLine();
        System.out.println("Altered String: "+ swapLastTwoChar(str));
    }

    private static String swapLastTwoChar(String str) {
        if(str.length() < 2) {
            return "STRING MUST CONTAINS TWO CHARACTERS";
        }
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }
}
