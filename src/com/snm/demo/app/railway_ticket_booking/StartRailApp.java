package com.snm.demo.app.railway_ticket_booking;

import java.util.Scanner;

public class StartRailApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("CHENNAI EXPRESS RESERVATION");
    int choice;
    do {
      System.out.println("\nHello!");
      System.out.println();
      System.out.println("1. Book Ticket");
      System.out.println("2. Cancel Ticket");
      System.out.println("3. Available Ticket");
      System.out.println("4. Ticket status");
      System.out.println("5. Admin");
      System.out.println("6. Quit");
      System.out.println();
      System.out.println("Please choose a service: ");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          BookingService.getInstance().bookTicket();
          break;
        case 2:
          // TODO
          break;
        case 3:
          TicketService.getInstance().printAvailableTicket();
          break;
        case 4:
          // TODO
          break;
        case 5:
          System.out.println("Enter username: ");
          String uname = scan.next();
          System.out.println("Enter password: ");
          String upass = scan.next();
          if (!uname.equals("admin") && upass.equals("adminpassword")) {
            System.out.println("Invalid Credential. Try again!");
            break;
          }
          // TODO
          break;
        case 6:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice! TRY AGAIN");
      }
    } while (choice != 6);
  }
}
