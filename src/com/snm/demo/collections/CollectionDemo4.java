/*
LinkedList Demo
*/
package com.snm.demo.collections;

import java.util.LinkedList;

public class CollectionDemo4 {
  public static void main(String[] args) {
    LinkedList<String> lList = new LinkedList<>();

    lList.add("Banana");
    lList.add("Apple");
    lList.add("Guava");

    System.out.println(lList);

    System.out.println(lList.contains("Apple"));

    int index = lList.indexOf("Guava");
    if (index != -1) {
      lList.set(index, "Orange");
    }

    System.out.println(lList);
    lList.remove(1);
    System.out.println(lList);
    lList.removeFirst();
    System.out.println(lList);
  }
}
