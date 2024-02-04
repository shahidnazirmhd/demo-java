/*
Write a Java program to check if a sub-array is formed by consecutive integers from a given array of integers.
*/
package com.snm.demo.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayDemo8 {
    public static void main(String[] args) {
        //Input
        int[] nums = {2, 5, 0, 2, 1, 4, 3, 6, 1, 0};
        findConsecutiveSubarray(nums);
    }

    static void findConsecutiveSubarray(int[] nums) {
        int maxLength = 0, start = 0, end = 0;

        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : nums) {
            int currentLength = 0;
            int currentNum = num;

            // Check if the current number is the start of a subarray
            while (numSet.contains(currentNum)) {
                currentLength++;
                currentNum++;
            }

            // Update the longest subarray if needed
            if (currentLength > maxLength) {
                maxLength = currentLength;
                start = num;
                end = num + maxLength - 1;
            }
        }

        System.out.println("The largest sub-array is [" + start + ", " + end + "]");
        System.out.print("Elements of the sub-array: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
