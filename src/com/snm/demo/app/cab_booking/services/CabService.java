package com.snm.demo.app.cab_booking.services;

import com.snm.demo.app.cab_booking.data.AppData;
import com.snm.demo.app.cab_booking.models.Cab;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class CabService {
  private static CabService cabService = null;

  private CabService() {}

  public static CabService getInstance() {
    if (cabService == null) cabService = new CabService();
    return cabService;
  }

  public void showAvailableCabs() {

    Map<String, List<Integer>> cabGroupByLocation =
        AppData.getCabs().stream()
            .collect(
                Collectors.groupingBy(
                    Cab::getLocation, Collectors.mapping(Cab::getCabId, Collectors.toList())));
    System.out.println("\nLocation\tCabIDs");
    AppData.getLocations()
        .forEach(
            location ->
                System.out.println(
                    location.getLocationName()
                        + "\t\t"
                        + cabGroupByLocation
                            .getOrDefault(location.getLocationName(), new ArrayList<>())
                            .stream()
                            .map(Object::toString)
                            .collect(Collectors.joining(","))));
  }
}
