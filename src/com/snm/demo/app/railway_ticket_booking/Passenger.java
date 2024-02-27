package com.snm.demo.app.railway_ticket_booking;

public class Passenger {
  public static int countOfPassengerUsingApp = 0;
  private final int id;
  private final String name;
  private final int age;
  private final Gender gender;
  private final long mobileNo;
  private final String prefferedBerth;
  private String allotedberth;
  private int seatNo;

  public Passenger(String name, int age, Gender gender, long mobileNo, String prefferedBerth) {
    countOfPassengerUsingApp += 1;
    this.id = countOfPassengerUsingApp;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.mobileNo = mobileNo;
    this.prefferedBerth = prefferedBerth;
  }

  public static int getCountOfPassengerUsingApp() {
    return countOfPassengerUsingApp;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Gender getGender() {
    return gender;
  }

  public long getMobileNo() {
    return mobileNo;
  }

  public String getPrefferedBerth() {
    return prefferedBerth;
  }

  public String getAllotedberth() {
    return allotedberth;
  }

  public int getSeatNo() {
    return seatNo;
  }

  public void setAllotedberth(String allotedberth) {
    this.allotedberth = allotedberth;
  }

  public void setSeatNo(int seatNo) {
    this.seatNo = seatNo;
  }
}
