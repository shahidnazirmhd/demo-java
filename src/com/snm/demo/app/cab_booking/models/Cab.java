package com.snm.demo.app.cab_booking.models;

public class Cab {
  private final int cabId;
  private String location;

  public Cab(int cabId, String location) {
    this.cabId = cabId;
    this.location = location;
  }

  public int getCabId() {
    return cabId;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
