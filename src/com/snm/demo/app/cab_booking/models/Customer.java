package com.snm.demo.app.cab_booking.models;

public class Customer {

  private final String customerName;
  private final String customerPass;
  private final int customerAge;

  public Customer(String customerName, String customerPass, int customerAge) {

    this.customerName = customerName;
    this.customerPass = customerPass;
    this.customerAge = customerAge;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getCustomerPass() {
    return customerPass;
  }

  public int getCustomerAge() {
    return customerAge;
  }
}
