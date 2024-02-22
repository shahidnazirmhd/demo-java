package com.snm.demo.collections.linkedlist_operation;

public class LinkedList {
  private Node head;

  public LinkedList() {
    this.head = null;
  }

  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }
}
