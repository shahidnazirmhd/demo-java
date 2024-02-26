package com.snm.demo.app.cab_booking;

public class Ride {
  private static int rideCount = 0;
  private final int id;
  private final Customer customer;
  private final int cabId;
  private final int distanceOfCabFromCustomer;
  private final int rideDistance;
  private final double fare;

  private final int pTime;
  private final int dTime;
  private final char pPoint;
  private final char dPoint;

  public Ride(
      Customer customer,
      int cabId,
      int distanceOf,
      int rideDistance,
      double fare,
      int pTime,
      int dTime,
      char pPoint,
      char dPoint) {
    this.pTime = pTime;
    this.dTime = dTime;
    this.pPoint = pPoint;
    this.dPoint = dPoint;
    rideCount += 1;
    this.id = rideCount;
    this.customer = customer;
    this.cabId = cabId;
    this.distanceOfCabFromCustomer = distanceOf;
    this.rideDistance = rideDistance;
    this.fare = fare;
  }

  public static int getRideCount() {
    return rideCount;
  }

  public int getId() {
    return id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public Cab getCab() {
    return cab;
  }

  public int getDistanceOfCabFromCustomer() {
    return distanceOfCabFromCustomer;
  }

  public int getRideDistance() {
    return rideDistance;
  }

  public double getFare() {
    return fare;
  }
}
