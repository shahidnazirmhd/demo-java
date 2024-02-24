package com.snm.demo.app.cab_booking.services;

import com.snm.demo.app.cab_booking.data.AppData;
import com.snm.demo.app.cab_booking.models.Cab;
import com.snm.demo.app.cab_booking.models.Customer;
import com.snm.demo.app.cab_booking.models.Location;

import java.util.List;
import java.util.Scanner;

public class BookingService {
  private static BookingService bookingService = null;
  private final Scanner scan;

  private BookingService() {
    this.scan = new Scanner(System.in);
  }

  public static BookingService getInstance() {
    if (bookingService == null) bookingService = new BookingService();
    return bookingService;
  }

  public void hireCab(Customer customer) {
    String sourceLocation;
    String destinationLocation;
    System.out.println("Enter source location: ");
    sourceLocation = scan.next();
    if (!isValidLocation(sourceLocation)) {
      System.out.println("Invalid source location. Try again");
      hireCab(customer);
      return;
    }
    System.out.println("Enter destination location:");
    destinationLocation = scan.next();
    if (!isValidLocation(destinationLocation)) {
      System.out.println("Invalid destination location. Try again");
      hireCab(customer);
      return;
    }
  }

  public void bookingDetails(Customer customer) {}

  private boolean isValidLocation(String locationName) {
    return AppData.getLocations().stream()
        .map(Location::getLocationName)
        .anyMatch(location -> location.equals(locationName));
  }

  private static int getLocationDistance(String locationName, List<Location> locations) {
    for (Location location : locations) {
      if (location.getLocationName().equals(locationName)) {
        return location.getDistanceFromOrigin();
      }
    }
    return -1; // Return -1 if location not found
  }
}
