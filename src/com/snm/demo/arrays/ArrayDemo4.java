/*
Write a Java program to print all the LEADERS in the array.
Note: An element is leader if it is greater than all the elements to its right side.
And the rightmost element is always a leader.
 */

/*
It can also be achieved by two methods
*/
package com.snm.demo.arrays;

import java.util.Scanner;

public class ArrayDemo4 {

    public static void printLeaders(int[] arr) {
       int size = arr.length;
        System.out.println(size);
//       int leader = arr[size-1];
//       System.out.print("Leaders are: " + leader);
//       for(int i = size - 2; i >= 0; i--) {
//          if(arr[i] > leader) {
//              leader = arr[i];
//              System.out.print(" " + leader);
//          }
//        }
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if(arr[i] <= arr[j]) {
                    break;
                }
            }
            if(j == size){
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of the number array:");
        int len = scan.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter values:");
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        printLeaders(arr);
    }
}






























/*
for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
 */