/*
Queue Demo
 */
package com.snm.demo.collections;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionDemo8 {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.offer("grapes");
    queue.offer("banana");
    queue.offer("kiwi");
    queue.offer("guava");
    queue.offer("melon");
    System.out.println(queue);

    queue.offer("nuts");

    String poll = queue.poll();
    System.out.println(poll);

    System.out.println(queue);

    queue.remove("nuts");

    System.out.println(queue);
  }
}
