package com.snm.demo.app.cab_booking;

public class Customer {
  private static int customerCount = 0;
  private final int id;
  private final String name;

  public Customer(String name) {
    customerCount += 1;
    this.name = name;
    this.id = customerCount;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
