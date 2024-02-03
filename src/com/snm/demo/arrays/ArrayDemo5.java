/*
Write a Java program to sort an array of positive integers of a given array. In the sorted array the value of the
first element should be maximum, second value should be minimum value, third should be the second maximum,
fourth second be second minimum and so on.
*/

package com.snm.demo.arrays;

import java.util.Arrays;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Original array: " + Arrays.toString(array));

        maxMinSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    private static void maxMinSort(int[] array) {
       // Sort in ascending
        Arrays.sort(array);
        int len = array.length;
        int[] result = new int[len];

        //Arrange element through traverse the array
        for (int i = 0, j = len - 1, k = 0; i <= j ; i++, j--) {
            result[k++] = array[j];
            if (k < len) {
                result[k++] = array[i];
            }
        }

        //copy to original array
        System.arraycopy(result, 0, array, 0, len);
    }
}

