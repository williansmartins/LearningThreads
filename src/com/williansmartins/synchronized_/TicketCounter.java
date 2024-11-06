package com.williansmartins.synchronized_;

class TicketCounter {
    private int tickets = 5;

    public synchronized void buyTicket(String name) {
        if (tickets > 0) {
            System.out.println(name + " bought a ticket.");
            tickets--;
            System.out.println("Tickets remaining: " + tickets);
        } else {
            System.out.println("Tickets sold out for " + name);
        }
    }
}