package com.snm.demo.app.railway_ticket_booking;

import java.util.*;

public class AppData {
  public static List<Integer> availableUpperBerth;
  public static List<Integer> availableMiddleBerth;
  public static List<Integer> availableLowerBerth;
  public static List<Integer> availableSideLowerBerth;
  public static Map<Integer, Passenger> passengers;
  public static List<Integer> confirmBooked;
  public static Queue<Integer> racBooked;
  public static Queue<Integer> waitingListBooked;

  static {
    initialize(21, 21, 21, 9);
    passengers = new HashMap<>();
    confirmBooked = new ArrayList<>();
    racBooked = new LinkedList<>();
    waitingListBooked = new LinkedList<>();
  }

  public static int totalTickets =
      availableUpperBerth.size() + availableMiddleBerth.size() + availableLowerBerth.size();
  public static int totalRACTickets = availableSideLowerBerth.size();
  public static int waitingList = 10;

  public static void initialize(int upper, int middle, int lower, int sideLower) {
    int partedSideLower = sideLower * 2;

    availableUpperBerth = new ArrayList<>();
    availableMiddleBerth = new ArrayList<>();
    availableLowerBerth = new ArrayList<>();
    availableSideLowerBerth = new ArrayList<>();

    for (int i = 1; i <= upper; i++) {
      availableUpperBerth.add(i);
    }

    for (int i = 1; i <= middle; i++) {
      availableMiddleBerth.add(i);
    }

    for (int i = 1; i <= lower; i++) {
      availableLowerBerth.add(i);
    }

    for (int i = 1; i <= partedSideLower; i++) {
      availableSideLowerBerth.add(i);
    }
  }
}
