package com.snm.demo.app.cab_booking.models;

public class Ride {
  private final CabDriver cabDriver;
  private final Cab cab;
  private final Location source;
  private final Location destination;
  private final double fare;
  private final double shalaCommission;

  public Ride(
      CabDriver cabDriver,
      Cab cab,
      Location source,
      Location destination,
      double fare,
      double shalaCommission) {
    this.cabDriver = cabDriver;
    this.cab = cab;
    this.source = source;
    this.destination = destination;
    this.fare = fare;
    this.shalaCommission = shalaCommission;
  }

  public CabDriver getCabDriver() {
    return cabDriver;
  }

  public Cab getCab() {
    return cab;
  }

  public Location getSource() {
    return source;
  }

  public Location getDestination() {
    return destination;
  }

  public double getFare() {
    return fare;
  }

  public double getShalaCommission() {
    return shalaCommission;
  }

  @Override
  public String toString() {
    return "Ride{"
        + "cabDriver="
        + cabDriver
        + ", cab="
        + cab
        + ", source="
        + source
        + ", destination="
        + destination
        + ", fare="
        + fare
        + ", shalaCommission="
        + shalaCommission
        + '}';
  }
}
