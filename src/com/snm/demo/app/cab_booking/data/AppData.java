package com.snm.demo.app.cab_booking.data;

import com.snm.demo.app.cab_booking.models.Cab;
import com.snm.demo.app.cab_booking.models.CabDriver;
import com.snm.demo.app.cab_booking.models.Customer;
import com.snm.demo.app.cab_booking.models.Location;

import java.util.*;

public class AppData {
  private static final List<CabDriver> cabDrivers = new ArrayList<>();
  private static final List<Customer> customers = new ArrayList<>();
  private static final List<Location> locations = new ArrayList<>();
  private static final List<Cab> cabs = new ArrayList<>();

  static {
    addInitialData();
  }

  private static void addInitialData() {
    // Drivers
    cabDrivers.add(new CabDriver("aaa", "111", 25));
    cabDrivers.add(new CabDriver("bbb", "222", 36));
    cabDrivers.add(new CabDriver("ccc", "333", 31));
    cabDrivers.add(new CabDriver("ddd", "444", 28));

    // Customers
    customers.add(new Customer("WW", "55", 25));
    customers.add(new Customer("XX", "66", 36));
    customers.add(new Customer("YY", "77", 31));
    customers.add(new Customer("ZZ", "88", 28));

    // Location
    locations.add(new Location(1, "A", 0));
    locations.add(new Location(2, "B", 15));
    locations.add(new Location(3, "C", 4));
    locations.add(new Location(4, "D", 7));
    locations.add(new Location(5, "E", 23));
    locations.add(new Location(6, "F", 9));
    locations.add(new Location(7, "G", 18));
    locations.add(new Location(8, "H", 20));

    // Cab
    cabs.add(new Cab(1, "D"));
    cabs.add(new Cab(2, "G"));
    cabs.add(new Cab(3, "H"));
    cabs.add(new Cab(4, "A"));
  }

  public static List<CabDriver> getCabDrivers() {
    return cabDrivers;
  }

  public static List<Customer> getCustomers() {
    return customers;
  }

  public static List<Location> getLocations() {
    return locations;
  }

  public static List<Cab> getCabs() {
    return cabs;
  }
}
