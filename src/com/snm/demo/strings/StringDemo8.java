/*
Write a Java program to match two strings where one string contains wildcard characters.
 */

/*
. (dot): Matches any single character except newline characters.
* (asterisk): Matches zero or more occurrences of the preceding character.
+ (plus): Matches one or more occurrences of the preceding character.
? (question mark): Matches exactly one occurrence of any character.

Replace . (dot) with \. (to escape the dot character).
Replace * (asterisk) with .*
Replace + (plus) with .+
Replace ? (question mark) with .
 */
package com.snm.demo.strings;

public class StringDemo8 {
    public static boolean isMatch(String str, String pattern) {
        // Replace wildcard characters with their regex equivalents
        pattern = pattern.replace(".", "\\.");
        pattern = pattern.replace("?", ".");
        pattern = pattern.replace("*", ".*");
        pattern = pattern.replace("+", ".+");

        // Use matches() method to check if the string matches the pattern


        return str.matches(pattern);
    }

    public static void main(String[] args) {
        String str = "abcdhgh";
        String pattern = "abc*d?*";

        System.out.println("The given string is: " + str);
        System.out.println("The given pattern string is: " + pattern);

        if (isMatch(str, pattern)) {
            System.out.println("The given pattern matches.");
        } else {
            System.out.println("The given pattern does not match.");
        }
    }
}
