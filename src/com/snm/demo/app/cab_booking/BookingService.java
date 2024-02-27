package com.snm.demo.app.cab_booking;

import java.util.List;
import java.util.Scanner;

public class BookingService {
  private static BookingService booking = null;
  private final Scanner scan;

  private BookingService() {
    this.scan = new Scanner(System.in);
  }

  public static BookingService getInstance() {

    if (booking == null) booking = new BookingService();

    return booking;
  }

  public void book() {
    System.out.println("------Enter 0 for go to main menu-----\n");
    System.out.println("Enter your name: ");
    String name = scan.next();
    if (name.equals("0")) {
      return;
    }
    Customer customer = new Customer(name);

    System.out.println("\nOur services available in following location(Point):");
    System.out.println("A B C D E F\n");

    char pPoint = getPointOf("Pickup");
    if (pPoint == '0') {
      return;
    }
    char dPoint = getPointOf("Drop");
    if (dPoint == '0') {
      return;
    }
    int pTime = getTimeOf("Pickup");
    if (pTime == 0) {
      return;
    }

    List<Cab> availableCabs = CabService.getInstance().getAvailableCabs(pTime, pPoint);
    if (availableCabs.isEmpty()) {
      System.out.println("There are no cabs available now.");
      return;
    }
    bookCab(customer, availableCabs, pTime, pPoint, dPoint);
  }

  private void bookCab(
      Customer customer, List<Cab> availableCabs, int pTime, char pPoint, char dPoint) {
    int minDistance = Integer.MAX_VALUE;
    Cab bookedCab = null;
    for (Cab cab : availableCabs) {
      int distanceOfCab = Math.abs((cab.getCurrentLocation() - '0') - (pPoint - '0')) * 15;
      if (distanceOfCab < minDistance) {
        bookedCab = cab;
        minDistance = distanceOfCab;
      }
    }

    int rideDistance = Math.abs((dPoint - '0') - (pPoint - '0')) * 15;
    double fare = ((rideDistance - 5) * 10) + 100;
    int dTime = pTime + rideDistance / 15;

    bookedCab.setCurrentLocation(dPoint);
    bookedCab.setFreeTime(dTime);
    bookedCab.setTotalEarnings(bookedCab.getTotalEarnings() + fare);

    Ride thisRide =
        new Ride(
            customer,
            bookedCab.getId(),
            minDistance,
            rideDistance,
            fare,
            pTime,
            dTime,
            pPoint,
            dPoint);

    bookedCab.addlRide(thisRide);

    System.out.println("Hi! " + customer.getName());
    System.out.println(
        "Cab "
            + bookedCab.getId()
            + " is booked. It is "
            + minDistance
            + "KM away from your point. Cab will arrive by "
            + pTime
            + ".");
    System.out.println("Your fare is " + fare);
    System.out.println("Your booking Id: " + thisRide.getId());
    System.out.println("Happy journey!\n");
  }

  private int getTimeOf(String name) {
    System.out.println("Enter " + name + "Time: ");
    int time = scan.nextInt();
    if (time != 0) {
      if (time > 24) {
        System.out.println("\nInvalid time\n");
        getTimeOf(name);
      }
    }
    return time;
  }

  private char getPointOf(String name) {
    System.out.println("Enter " + name + " point: ");
    char point = scan.next().charAt(0);
    if (point != '0') {
      if (point < 'A' || point > 'F') {
        System.out.println("\nInvalid location");
        System.out.println("Our services available in following location(Point):");
        System.out.println("A B C D E F\n");
        getPointOf(name);
      }
    }
    return point;
  }

  public void printCabDetails(boolean isAdmin) {
    CabService.getInstance().printAllCabDetails(isAdmin);
    if (isAdmin) {
      CabService.getInstance().printAllRideDetails();
    }
  }
}
