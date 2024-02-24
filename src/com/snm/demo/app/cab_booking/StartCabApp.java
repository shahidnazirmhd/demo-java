package com.snm.demo.app.cab_booking;

import com.snm.demo.app.cab_booking.models.Customer;
import com.snm.demo.app.cab_booking.services.AdminService;
import com.snm.demo.app.cab_booking.services.CabDriverService;
import com.snm.demo.app.cab_booking.services.CustomerService;

import java.util.Scanner;

public class StartCabApp {
  public static void main(String[] args) {
    CabDriverService cabDriverService = CabDriverService.getInstance();
    CustomerService customerService = CustomerService.getInstance();
    AdminService adminService = AdminService.getInstance();
    Scanner scan = new Scanner(System.in);
    System.out.println("WELCOME TO SHALA CABS");
    int choice;
    do {
      System.out.println("Hello!");
      System.out.println();
      System.out.println("1. Cab Driver Login");
      System.out.println("2. Customer Login");
      System.out.println("3. Administration Login");
      System.out.println("4. Quit");
      System.out.println();
      System.out.println("Please choose a service: ");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          cabDriverService.cabDriverLogin();
          break;
        case 2:
          customerService.customerLoginRegister();
          break;
        case 3:
          System.out.println("3");
          // TODO
          break;
        case 4:
          System.out.println("Exiting...");
          // TODO
          break;
        default:
          System.out.println("Invalid choice! TRY AGAIN");
      }
    } while (choice != 4);
  }
}
