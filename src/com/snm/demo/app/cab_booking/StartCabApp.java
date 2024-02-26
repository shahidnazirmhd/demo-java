package com.snm.demo.app.cab_booking;

import java.util.Scanner;

public class StartCabApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("WELCOME TO SHALA CABS");
    int choice;
    do {
      System.out.println("Hello!");
      System.out.println();
      System.out.println("1. Book Cab");
      System.out.println("2. Cab details");
      System.out.println("3. Admin");
      System.out.println("4. Quit");
      System.out.println();
      System.out.println("Please choose a service: ");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          BookingService.getInstance().book();
          break;
        case 2:
          BookingService.getInstance().printCabDetails(false);
          break;
        case 3:
          System.out.println("Enter username: ");
          String uname = scan.next();
          System.out.println("Enter password: ");
          String upass = scan.next();
          if(!uname.equals("admin") && upass.equals("adminpassword")) {
            System.out.println("Invalid Credential. Try again!");
            break;
          }
          BookingService.getInstance().printCabDetails(true);
          break;
        case 4:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice! TRY AGAIN");
      }
    } while (choice != 4);
  }
}
