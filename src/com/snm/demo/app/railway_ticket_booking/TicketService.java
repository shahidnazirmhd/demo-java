package com.snm.demo.app.railway_ticket_booking;

public class TicketService {
  private static TicketService ticketService = null;

  private TicketService() {}

  public static TicketService getInstance() {
    if (ticketService == null) ticketService = new TicketService();
    return ticketService;
  }

  public boolean printAvailableTicket() {
    int totalTickets = AppData.totalTickets;
    int racTickets = AppData.totalRACTickets;
    int waitingList = AppData.waitingList;
    if (totalTickets == 0 && racTickets == 0) {
      int ticketsInWaitingList = 10 - waitingList;
      if (ticketsInWaitingList == 10) {
        System.out.println("No tickets available right now.\nTry after some time!");
        return false;
      }
      System.out.println("Tickets in waiting List" + ticketsInWaitingList);
      System.out.println("*Total capacity of waiting List is 10");
      return true;
    } else if (totalTickets == 0 && racTickets != 0) {
      System.out.println("RAC : " + racTickets);
      return true;
    } else {
      System.out.println("Available : " + totalTickets);
      return true;
    }
  }

  public boolean canBookTicket(int noOfPassengers) {
    if (noOfPassengers <= AppData.totalTickets) {
      return true;
    } else if (noOfPassengers <= AppData.totalRACTickets) {
      return true;
    } else return noOfPassengers <= AppData.waitingList;
  }

  public void allotBerth(Passenger p) {
    if (AppData.totalTickets
        > 0) { // This (else - if) condition is not necessary. (It is to avoid waste of if check
      // operation)
      if ((p.getPreferredBerth().equals("L") && !AppData.availableLowerBerth.isEmpty())
          || (p.getPreferredBerth().equals("M") && !AppData.availableMiddleBerth.isEmpty())
          || (p.getPreferredBerth().equals("U") && !AppData.availableUpperBerth.isEmpty())) {
        if (p.getPreferredBerth().equals("L")) {
          p.setAllotedberth("L");
          p.setSeatNo(AppData.availableLowerBerth.get(0));
          AppData.availableLowerBerth.remove(0);
        } else if (p.getPreferredBerth().equals("M")) {
          p.setAllotedberth("M");
          p.setSeatNo(AppData.availableMiddleBerth.get(0));
          AppData.availableMiddleBerth.remove(0);
        } else if (p.getPreferredBerth().equals("U")) {
          p.setAllotedberth("U");
          p.setSeatNo(AppData.availableUpperBerth.get(0));
          AppData.availableUpperBerth.remove(0);
        }
      } else if (p.getAge() >= 60 && !AppData.availableLowerBerth.isEmpty()) {
        p.setAllotedberth("L");
        p.setSeatNo(AppData.availableLowerBerth.get(0));
        AppData.availableLowerBerth.remove(0);
      } else if (!AppData.availableLowerBerth.isEmpty()) {
        p.setAllotedberth("L");
        p.setSeatNo(AppData.availableLowerBerth.get(0));
        AppData.availableLowerBerth.remove(0);
      } else if (!AppData.availableMiddleBerth.isEmpty()) {
        p.setAllotedberth("M");
        p.setSeatNo(AppData.availableMiddleBerth.get(0));
        AppData.availableMiddleBerth.remove(0);
      } else if (!AppData.availableUpperBerth.isEmpty()) {
        p.setAllotedberth("U");
        p.setSeatNo(AppData.availableUpperBerth.get(0));
        AppData.availableUpperBerth.remove(0);
      }
    } else if (AppData.totalRACTickets > 0) {
      if (!AppData.availableSideLowerBerth.isEmpty()) {
        p.setAllotedberth("RAC");
        p.setSeatNo(AppData.availableSideLowerBerth.get(0));
        AppData.availableSideLowerBerth.remove(0);
      }
    } else if (AppData.waitingList > 0) {
      p.setAllotedberth("WL");
      p.setSeatNo(-1);
      AppData.waitingList--;
    }
  }
}
