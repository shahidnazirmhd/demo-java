/*
Write a Java program to check if a given array contains a subarray with 0 sum
 */
package com.snm.demo.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayDemo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int len = scan.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter array values: ");
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Entered Array: " + Arrays.toString(arr));
        System.out.println("Does the said array contain a subarray with 0 sum: " + hasSubArrayWithSumZero(arr));
    }

    private static boolean hasSubArrayWithSumZero(int[] arr) {
        int len = arr.length;
//        for (int i = 0; i < len; i++) {
//            int sum = arr[i];
//            if (sum == 0) {
//                return true;
//            }
//            for (int j = i + 1; j < len ; j++) {
//               sum+=arr[j];
//                if(sum == 0){
//                    return true;
//                }
//            }
//        }
        int sum = 0;
        Set<Integer> hs = new HashSet<>();
        for (int j : arr) {
            sum += j;
            if (j == 0 || sum == 0 || hs.contains(sum))
                return true;
            hs.add(sum);
        }
        return  false;
    }
}
