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

  public boolean search(int data) {
    Node temp = head;
    while (temp != null) {
      if (temp.data == data) {
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

  public void delete(int data) {
    if (head == null) {
      return;
    }
    if (head.data == data) {
      head = head.next;
    }
    Node prev = null;
    Node curr = head;
    while (curr != null && curr.data != data) {
      prev = curr;
      curr = curr.next;
    }
    if (curr != null) {
      prev.next = curr.next;
    }
  }

  public void update(int oldData, int newData) {
    Node temp = head;
    while (temp != null) {
      if (temp.data == oldData) {
        temp.data = newData;
        return;
      }
      temp = temp.next;
    }
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }
}
