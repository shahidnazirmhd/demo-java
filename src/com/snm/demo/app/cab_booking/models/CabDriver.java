package com.snm.demo.app.cab_booking.models;

public class CabDriver {

  private final String driverName;
  private final String driverPass;
  private final int driverAge;

  public CabDriver(String driverName, String driverPass, int driverAge) {

    this.driverName = driverName;
    this.driverPass = driverPass;
    this.driverAge = driverAge;
  }

  public String getDriverName() {
    return driverName;
  }

  public String getDriverPass() {
    return driverPass;
  }

  public int getDriverAge() {
    return driverAge;
  }
}
