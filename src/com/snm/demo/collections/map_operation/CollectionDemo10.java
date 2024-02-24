/*
Map implementation
 */
package com.snm.demo.collections.map_operation;

public class CollectionDemo10 {
  public static void main(String[] args) {
    MyMap<Integer, String> ownMap = new MyMap<>();
    ownMap.put(2, "Fig");
    ownMap.put(4, "Apple");
    ownMap.put(6, "Banana");
    ownMap.put(8, "Kiwi");
    ownMap.put(2, "Orange");

    ownMap.display();

    ownMap.remove(2);

    ownMap.display();

    // ownMap.clear();
    // ownMap.display();

    System.out.println(ownMap.size());

    ownMap.values().forEach(System.out::println);
    ownMap.keys().forEach(System.out::println);
    System.out.println(ownMap.containsKey(8));
    System.out.println(ownMap.containsValue("Banana"));
    System.out.println(ownMap.containsKeyValue(4, "Apple"));
  }
}
