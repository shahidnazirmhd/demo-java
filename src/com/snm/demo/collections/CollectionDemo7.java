/*
Stack Demo
 */
package com.snm.demo.collections;

import java.util.Stack;

public class CollectionDemo7 {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(3);
    stack.push(7);
    stack.push(5);
    stack.push(4);
    stack.push(2);
    stack.push(1);
    stack.push(11);
    stack.push(1);

    System.out.println(stack);

    System.out.println(stack.contains(1));

    stack.push(9);

    System.out.println(stack);

    int removedElement = stack.pop(); // LIFO
    System.out.println(removedElement);

    // after removing
    System.out.println(stack);

    stack.remove(Integer.valueOf(1));
    System.out.println();

    System.out.println(stack);

    stack.set(2, 8);

    System.out.println(stack);
  }
}
