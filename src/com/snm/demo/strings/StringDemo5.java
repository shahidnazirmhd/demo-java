/*
Write a Java program to find first non-repeating character in a string.
 */
package com.snm.demo.strings;

public class StringDemo5 {
    public static void main(String[] args) {
        String str = "organization";
        printFirstNonRepeatingChar(str);
    }
    private static void printFirstNonRepeatingChar(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i), str.indexOf(str.charAt(i)) + 1) == -1) {
                System.out.println("First Non-repeating character is: " + str.charAt(i));
                break;
            }
        }
    }

}
