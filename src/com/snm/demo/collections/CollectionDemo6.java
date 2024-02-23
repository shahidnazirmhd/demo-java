/*
Sorts the ArrayList A in ascending order
 */
package com.snm.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionDemo6 {
  public static void main(String[] args) {
    List<Integer> A = new ArrayList<>();
    A.add(5);
    A.add(100);
    A.add(88);
    A.add(2);
    A.add(45);

    System.out.println(A);

    // Reverse
    Collections.reverse(A);

    System.out.println(A);
    System.out.println(A.size());

    for (int i = 0; i < A.size(); i++) {
      System.out.print(A.get(i));
      if (i < A.size() - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();

    // Ascending
    // Collections.sort(A);
    A.sort(Comparator.naturalOrder());

    System.out.println(A);

    // Descending
    // Collections.sort(A, Comparator.reverseOrder());
    A.sort(Comparator.reverseOrder());

    System.out.println(A);

    List<Integer> collect = A.stream().sorted().toList();
    System.out.println(collect);
    ArrayList<Integer> collect1 =
        A.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
    System.out.println(collect1);
  }
}
