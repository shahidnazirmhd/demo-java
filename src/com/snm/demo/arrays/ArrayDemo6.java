/*
Write a Java program to replace every element with the next best element (from right side) in a given array of
integers. There is no element next to the last element, therefore replace it with -1.
 */
package com.snm.demo.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Entered Array: " + Arrays.toString(arr));
        replaceEveryElement(arr);
        System.out.println("Element replaced Array: " + Arrays.toString(arr));
    }
    static void replaceEveryElement(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int best = -1;
            for (int j = i + 1; j < len; j++) {
                best = Math.max(best, arr[j]);
            }
            arr[i] = best;
        }
    }
}
