/*
Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order
i.e. fill A with first p smallest elements and fill B with remaining elements.
 */
package com.snm.demo.arrays;

import java.util.Arrays;

public class ArrayDemo9 {
    public static void main(String[] args) {
        int[] A = { 1, 5, 6, 7, 8, 10 };
        int[] B = { 2, 4, 9 };
        System.out.println("Original Arrays: ");
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        reFill(A,B);
        System.out.println("Changed Arrays: ");
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }

    private static void reFill(int[] A, int[] B){
        int p = A.length;
        int q = B.length;
        int[] expArr = new int[p + q];

        // Copy elements from array1 to mergedArray
        System.arraycopy(A, 0, expArr, 0, p);

        // Copy elements from array2 to mergedArray
        System.arraycopy(B, 0, expArr, p, q);

        Arrays.sort(expArr);

        int[] reA = Arrays.copyOfRange(expArr, 0, p);
        int[] reB = Arrays.copyOfRange(expArr, p, expArr.length);

        System.arraycopy(reA, 0, A, 0, p);
        System.arraycopy(reB, 0, B, 0, q);
    }
}
