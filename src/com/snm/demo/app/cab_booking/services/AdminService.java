package com.snm.demo.app.cab_booking.services;

public class AdminService {
  private static AdminService adminService = null;

  private AdminService() {}

  public static AdminService getInstance() {
    if (adminService == null) adminService = new AdminService();
    return adminService;
  }
}
