/*
Program to show up the vector class and its methods.
 */

/*
Vector is a class that implements a dynamic array.
It is similar to ArrayList, but Vector is synchronized, which means it is thread-safe.
This means that multiple threads can manipulate a Vector object concurrently without any inconsistency or data corruption.
However, this synchronization comes with a performance cost, making Vector generally slower than ArrayList when used in single-threaded applications.
 */
package com.snm.demo.collections;

import java.util.Vector;

public class CollectionDemo2 {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        System.out.println("Is the Vector empty? " + vector.isEmpty());

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Displaying
        System.out.println("Vector elements: " + vector);

        // Accessing elements
        System.out.println("Element at index 1: " + vector.get(1));

        // Updating an element
        vector.set(2, "Grapes");
        System.out.println("After updating: " + vector);

        // Removing an element
        vector.remove(0);
        System.out.println("After removing element at index 0: " + vector);

        // Checking the size
        System.out.println("Size of the Vector: " + vector.size());

        // Checking if the Vector is empty
        System.out.println("Is the Vector empty? " + vector.isEmpty());

        // Checking if an element exists in the Vector
        System.out.println("Does the Vector contain 'Banana'? " + vector.contains("Banana"));

        // Iterating over the Vector
        System.out.println("Iterating over the Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Clearing the Vector
        vector.clear();
        System.out.println("Vector after clearing: " + vector);
    }
}
