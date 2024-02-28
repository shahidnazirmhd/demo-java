package com.snm.demo.app.railway_ticket_booking;

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

  public void bookTicket() {
    boolean canContinue = TicketService.getInstance().printAvailableTicket();
    if (canContinue) {
      System.out.println("Enter number of passenger (including children) :");
      int noOfPassengers = scan.nextInt();
      boolean canBook = TicketService.getInstance().canBookTicket(noOfPassengers);
      if (canBook) {
        Passenger[] passengers = new Passenger[noOfPassengers];
        for (int i = 0; i < passengers.length; i++) {
          System.out.println("---Enter Details for Passenger - " + (i + 1) + "---");
          System.out.println("Enter name: ");
          String name = scan.next();
          System.out.println("Enter age: ");
          int age = scan.nextInt();
          System.out.println("Enter Gender: (MALE/FEMALE/OTHER)");
          String strGender = scan.next().toUpperCase();
          Gender gender = Gender.valueOf(strGender);
          System.out.println("Enter mobile no: ");
          long mobileNo = scan.nextLong();
          System.out.println("Enter preferred berth: (U - Upper | M - Middle | L - Lower)");
          String prefBerth = scan.next().toUpperCase();
          passengers[i] = new Passenger(name, age, gender, mobileNo, prefBerth);
          System.out.println();
        }
        bookTickets(passengers);
      } else {
        System.out.println("Unable to book.");
        TicketService.getInstance().printAvailableTicket();
      }
    }
  }

  private void bookTickets(Passenger[] passengers) {
    for (Passenger passenger : passengers) {
      TicketService.getInstance().allotBerth(passenger);
      if (passenger.getAllotedberth().equals("WL")) {
        AppData.waitingListBooked.add(passenger.getId());
        AppData.passengers.put(passenger.getId(), passenger);
        System.out.println(
            "Passenger Id: "
                + passenger.getId()
                + "Name: "
                + passenger.getName()
                + " - In Waiting List");
      } else if (passenger.getAllotedberth().equals("RAC")) {
        AppData.racBooked.add(passenger.getId());
        AppData.passengers.put(passenger.getId(), passenger);
        AppData.totalRACTickets--;
        System.out.println(
            "Passenger Id: " + passenger.getId() + "Name: " + passenger.getName() + " - In RAC");
      } else {
        AppData.confirmBooked.add(passenger.getId());
        AppData.passengers.put(passenger.getId(), passenger);
        AppData.totalTickets--;
        System.out.println(
            "Passenger Id: "
                + passenger.getId()
                + "Name: "
                + passenger.getName()
                + " - Confirm booked "
                + passenger.getSeatNo()
                + passenger.getAllotedberth());
      }
    }
  }
}
