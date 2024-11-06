package com.williansmartins.synchronized_;

public class Main {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        // Creating multiple threads simulating different people buying tickets
        Thread person1 = new Thread(() -> counter.buyTicket("Alice"));
        Thread person2 = new Thread(() -> counter.buyTicket("Bob"));
        Thread person3 = new Thread(() -> counter.buyTicket("Charlie"));
        Thread person4 = new Thread(() -> counter.buyTicket("Diana"));
        Thread person5 = new Thread(() -> counter.buyTicket("Eva"));

        // Starting the threads
        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
    }
}
