/*
Write a Java program to form the largest number from a given list of non-negative integers.
 */
package com.snm.demo.arrays;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArrayDemo10 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 4, 6};
        String largestNumber = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .sorted((s1,s2) -> (s2 + s1).compareTo(s1+s2))  //Lexicographic comparison
                .collect(Collectors.joining());
        System.out.println("Largest number using the said array numbers: " + largestNumber);
    }
/*
    private static class LargestNumberComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Compare the concatenation of s1 + s2 and s2 + s1
            // to determine the order that results in a larger number
            String order1 = s1 + s2;
            String order2 = s2 + s1;
            return order2.compareTo(order1); // Reverse order for descending sort
        }
    }
 */
}
