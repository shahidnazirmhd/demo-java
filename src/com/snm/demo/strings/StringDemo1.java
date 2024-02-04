/*
Write a Java program to get the character at the given index within the String.
 */
package com.snm.demo.strings;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scan.next();
        System.out.println("Get char from: ");
        int index = scan.nextInt();
        if (index >=0 && index < str.length() ) {
            System.out.println("Character of your string from index "+ index + " : " + getCharFromString(str,index));
        } else {
            System.out.println("Index is out of range");
        }


    }

    private static char getCharFromString(String str, int index) {
        return str.charAt(index);
    }
}
