package com.snm.demo.app.cab_booking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CabService {
  private static CabService cabService = null;

  private final List<Cab> cabs;

  private CabService() {
    this.cabs = getCabInNumberOf(4);
  }

  public static CabService getInstance() {
    if (cabService == null) cabService = new CabService();
    return cabService;
  }

  private List<Cab> getCabInNumberOf(int num) {
    List<Cab> cabs = new ArrayList<>();
    for (int i = 0; i < num; i++) {
      cabs.add(new Cab('A', 6));
    }
    return cabs;
  }

  public List<Cab> getAvailableCabs(int pTime, char pPoint) {
    return cabs.stream()
        .filter(cab -> isReachable(cab, pTime, pPoint))
        .sorted(Comparator.comparingDouble(Cab::getTotalEarnings))
        .collect(Collectors.toList());
  }

  private boolean isReachable(Cab cab, int pTime, char pPoint) {
    return cab.getFreeTime() <= pTime
        && Math.abs((cab.getCurrentLocation() - '0') - (pPoint - '0')) <= pTime - cab.getFreeTime();
  }
}
