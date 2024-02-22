/*
Program to perform various operations on ArrayList.
 */
package com.snm.demo.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CollectionDemo3 {
  public static void main(String[] args) {
    ArrayList<Integer> arrList = new ArrayList<>();
    arrList.add(12);
    arrList.add(78);
    arrList.add(34);
    arrList.add(51);
    arrList.add(62);
    arrList.add(62);
    arrList.add(45);
    arrList.add(74);
    arrList.add(91);
    arrList.add(28);
    arrList.add(2);

    // arrList.clear();

    long num = arrList.stream().sorted().findFirst().orElseGet(() -> -1).longValue();
    long num2 =
        arrList.stream()
            .filter(v -> v > 100)
            .sorted()
            .findFirst()
            .map(v -> (long) v)
            .orElse((long) -1);
    long num3 =
        arrList.stream()
            .filter(v -> v > 10)
            .sorted()
            .mapToLong(Integer::longValue)
            .findFirst()
            .orElse(-1);

    //    arrList.stream()
    //        .sorted(Comparator.reverseOrder())
    //        .findFirst()
    //        .filter(v -> v > 100)
    //        .ifPresentOrElse(
    //            System.out::println, () -> System.out.println("No Element found for greater than
    // 100"));

    arrList.stream()
        .min(Comparator.reverseOrder())
        .filter(v -> v > 100)
        .ifPresentOrElse(
            System.out::println, () -> System.out.println("No Element found for greater than 100"));
    /*
       Comparator.reverseOrder() creates a comparator that sorts elements in reverse order.
       .min() applies this comparator to find the minimum element, which effectively finds the maximum element because the stream is sorted in reverse order.
    */

    System.out.println(num);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(arrList);
    System.out.println(arrList.size());
    System.out.println(arrList.get(3));
    System.out.println(arrList.remove(5));
    System.out.println(arrList.set(3, 90));
    System.out.println(arrList);
  }
}
