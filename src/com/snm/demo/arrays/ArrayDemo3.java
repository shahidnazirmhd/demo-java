/*
Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
Sample array: [1,2,4,5,6]
Target value: 6.
 */
package com.snm.demo.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayDemo3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of the Integer array: ");
        int len = scan.nextInt();
        int[] nums = new int[len];
        System.out.println("Enter value for Integer array in one by one... ");
        for (int i = 0; i < len; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter target value: ");
        int target = scan.nextInt();

        findAndPrintTwoSum(nums, target);
    }

    public static void findAndPrintTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            int complement = target - num;
            if (numMap.containsKey(complement)) {
                System.out.println("Pair found: " + num + ", " + complement);
            }

            numMap.put(num, complement);
        }
    }
}

/*
5  false 1,5
4  false 2,4
3  false 3,3
2  true  4,2   4,2
1  true  5,1   5,1
0  false 6,0
 */