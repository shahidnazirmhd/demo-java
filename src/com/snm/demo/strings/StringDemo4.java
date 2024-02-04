/*
Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
 */
package com.snm.demo.strings;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scan.nextLine();
        System.out.println("Enter replace: ");
        String replace = scan.nextLine();
        System.out.println("Enter replace with: ");
        String replaceWith = scan.nextLine();

        String newStr = str.replaceAll(replace, replaceWith);
        System.out.println("Your new string : ");
        System.out.println(newStr);
    }
}
