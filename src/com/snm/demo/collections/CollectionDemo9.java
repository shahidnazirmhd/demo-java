/*
Map demo
 */
package com.snm.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionDemo9 {
  public static void main(String[] args) {
    Map<Integer, String> myMap = new HashMap<>();
    myMap.put(1, "Orange");
    myMap.put(3, "Apple");
    myMap.put(8, "Guava");
    myMap.put(2, "Banana");
    myMap.put(4, "Grapes");
    myMap.put(6, "Kiwi");
    myMap.put(9, "Banana");
    System.out.println(myMap);
    System.out.println(myMap.containsValue("Banana"));
    System.out.println(myMap.containsKey(9));
    myMap.put(9, "Fig");
    myMap.put(5, "Lime");
    System.out.println(myMap);
    myMap.replace(5, "melon");

    for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    for (int r : myMap.keySet()) {
      System.out.println(r + " : " + myMap.get(r));
    }

    System.out.println(myMap.remove(9));
    System.out.println(myMap.remove(9));
    System.out.println(myMap.remove(5, "Lime"));

    System.out.println(myMap);
  }
}
