package com.snm.demo.app.cab_booking.services;

import com.snm.demo.app.cab_booking.data.AppData;
import com.snm.demo.app.cab_booking.exceptions.InvalidCredentialException;
import com.snm.demo.app.cab_booking.models.CabDriver;
import com.snm.demo.app.cab_booking.util.MyUtil;

import java.util.Scanner;

public class CabDriverService {
  private static CabDriverService cabDriverService = null;
  private final Scanner scan;

  private CabDriverService() {
    this.scan = new Scanner(System.in);
  }

  public static CabDriverService getInstance() {
    if (cabDriverService == null) cabDriverService = new CabDriverService();
    return cabDriverService;
  }

  public void cabDriverLogin() {
    System.out.println("Enter username: ");
    String userName = scan.next();
    System.out.println("Enter password: ");
    String password = scan.next();
    CabDriver cabDriver =
        AppData.getCabDrivers().stream()
            .filter(
                driver ->
                    driver.getDriverName().equals(userName)
                        && driver.getDriverPass().equals(password))
            .findFirst()
            .orElse(null);
    if (cabDriver != null) {
      System.out.println("Login success");
    } else {
      System.out.println("Invalid credential. Try again!");
    }
  }
}
