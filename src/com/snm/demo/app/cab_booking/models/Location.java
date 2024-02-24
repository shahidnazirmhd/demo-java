package com.snm.demo.app.cab_booking.models;

public class Location {
  private final int locationId;
  private final String locationName;
  private final int distanceFromOrigin;

  public Location(int locationId, String locationName, int distanceFromOrigin) {
    this.locationId = locationId;
    this.locationName = locationName;
    this.distanceFromOrigin = distanceFromOrigin;
  }

  public int getLocationId() {
    return locationId;
  }

  public String getLocationName() {
    return locationName;
  }

  public int getDistanceFromOrigin() {
    return distanceFromOrigin;
  }
}
