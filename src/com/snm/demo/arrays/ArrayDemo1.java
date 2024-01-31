//1(L1).Write a Java program to sort a numeric array and a string array

package com.snm.demo.arrays;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //Sorting numeric array
        System.out.println("SORTING NUMERIC ARRAY");
        int[] numberArray = {5,8,23,68,59,55,945,887,445,8,2};
        System.out.println("...Original Array...");
        Arrays.stream(numberArray).forEach(System.out::println);
        System.out.println("...Sorted Array...");
        Arrays.stream(numberArray).sorted().forEach(System.out::println);

        //Sorting string array
        System.out.println("SORTING STRING ARRAY");
        String[] stringArray = {"apple", "banana", "orange", "grape", "kiwi", "mango", "jack", "guava"};
        System.out.println("...Original Array...");
        Arrays.stream(stringArray).forEach(System.out::println);
        System.out.println("...Sorted Array...");
        Arrays.stream(stringArray).sorted().forEach(System.out::println);
    }

}
