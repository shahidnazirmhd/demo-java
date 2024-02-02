/*
Write a Java program to print all the LEADERS in the array.
Note: An element is leader if it is greater than all the elements to its right side.
And the rightmost element is always a leader.
 */
package com.snm.demo.arrays;

public class ArrayDemo4 {

    public static void printLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1];

        // The last element is always a leader
        System.out.println("Leaders in the array:");
        System.out.print(maxFromRight + " ");

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        printLeaders(arr);
    }
}

/*
It can be achieved by using two loops
 */