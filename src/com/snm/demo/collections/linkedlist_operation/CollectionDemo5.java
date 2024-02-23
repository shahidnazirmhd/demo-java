package com.snm.demo.collections.linkedlist_operation;

public class CollectionDemo5 {
  public static void main(String[] args) {
    LinkedList custList = new LinkedList();
    custList.insert(2);
    custList.insert(3);
    custList.insert(5);
    custList.insert(7);
    custList.insert(8);

    custList.display();

    System.out.println(custList.search(5));

    custList.update(8, 9);

    custList.display();

    custList.insert(10);

    custList.display();

    custList.delete(7);

    custList.display();
  }
}
