package com.snm.demo.app.cab_booking;

import java.util.ArrayList;
import java.util.List;

public class Cab {
  private static int cabCount = 0;
  private final int id;
  private char currentLocation;
  private int freeTime;
  private double totalEarnings;
  private List<Ride> totalRide;

  public Cab(char initialLocation, int availableTime) {
    cabCount += 1;
    this.id = cabCount;
    this.currentLocation = initialLocation;
    this.freeTime = availableTime;
    this.totalEarnings = 0;
    this.totalRide = new ArrayList<>();
  }

  public static int getCabCount() {
    return cabCount;
  }

  public static void setCabCount(int cabCount) {
    Cab.cabCount = cabCount;
  }

  public int getId() {
    return id;
  }

  public char getCurrentLocation() {
    return currentLocation;
  }

  public void setCurrentLocation(char currentLocation) {
    this.currentLocation = currentLocation;
  }

  public int getFreeTime() {
    return freeTime;
  }

  public void setFreeTime(int freeTime) {
    this.freeTime = freeTime;
  }

  public double getTotalEarnings() {
    return totalEarnings;
  }

  public void setTotalEarnings(double totalEarnings) {
    this.totalEarnings = totalEarnings;
  }

  public List<Ride> getTotalRide() {
    return totalRide;
  }

  public void setTotalRide(List<Ride> totalRide) {
    this.totalRide = totalRide;
  }
}
