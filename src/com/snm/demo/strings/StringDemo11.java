/*
Simple Java program to check if a given string is a palindrome or not:
 */
package com.snm.demo.strings;

import java.util.Scanner;

public class StringDemo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scan.next();
        if(checkPalindrome(str)) {
            System.out.println("Entered string "+ str +" is palindrome");
        } else {
            System.out.println("Entered string "+ str +" is not palindrome");
        }

    }

    private static boolean checkPalindrome(String str) {
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
