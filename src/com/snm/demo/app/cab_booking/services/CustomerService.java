package com.snm.demo.app.cab_booking.services;

import com.snm.demo.app.cab_booking.data.AppData;
import com.snm.demo.app.cab_booking.models.Customer;

import java.util.Scanner;

public class CustomerService {
  private static CustomerService customerService = null;
  private final Scanner scan;
  private final BookingService bookingService;
  private final CabService cabService;

  private CustomerService() {
    this.scan = new Scanner(System.in);
    this.bookingService = BookingService.getInstance();
    this.cabService = CabService.getInstance();
  }

  public static CustomerService getInstance() {
    if (customerService == null) customerService = new CustomerService();
    return customerService;
  }

  public void customerLoginRegister() {
    System.out.println("-----New Customer? Press 1 for Register------");
    System.out.println("OR");
    System.out.println("LOGIN");
    System.out.println("Enter username: ");
    String result = scan.next();

    if (result.equals("1")) {
      customerRegistration();
      return;
    }

    System.out.println("Enter password: ");
    String password = scan.next();
    Customer customer =
        AppData.getCustomers().stream()
            .filter(
                user ->
                    user.getCustomerName().equals(result)
                        && user.getCustomerPass().equals(password))
            .findFirst()
            .orElse(null);
    if (customer != null) {
      boolean isLogout = false;
      do {
        System.out.println();
        System.out.println("Hi! " + customer.getCustomerName());
        System.out.println();
        System.out.println("1. Hire cab");
        System.out.println("2. Show available cab");
        System.out.println("3. My bookings");
        System.out.println("4. Logout");
        System.out.println("Please choose a service: ");
        int choice = scan.nextInt();
        switch (choice) {
          case 1:
            bookingService.hireCab(customer);
            break;
          case 2:
            cabService.showAvailableCabs();
            break;
          case 3:
            bookingService.bookingDetails(customer);
            break;
          case 4:
            isLogout = true;
            break;
          default:
            System.out.println("Invalid choice! TRY AGAIN");
        }

      } while (!isLogout);
    } else {
      System.out.println("Invalid credentials. Try again!");
    }
  }

  private void customerRegistration() {
    System.out.println("-----Already Customer? Press 1 for Login------");
    System.out.println("OR");
    System.out.println("REGISTER");
    System.out.println("Enter username: ");
    String result = scan.next();

    if (result.equals("1")) {
      customerLoginRegister();
      return;
    } else {
      boolean isMatch =
          AppData.getCustomers().stream()
              .anyMatch(customer -> customer.getCustomerName().equals(result));
      if (isMatch) {
        System.out.println("Username already exist. Try different");
        customerRegistration();
        return;
      }
    }

    System.out.println("Enter password:");
    String password = scan.next();

    System.out.println("Enter you age:");
    int age = scan.nextInt();

    Customer newCustomer = new Customer(result, password, age);

    AppData.getCustomers().add(newCustomer);
    System.out.println("Registration Successful");
    customerLoginRegister();
  }
}
