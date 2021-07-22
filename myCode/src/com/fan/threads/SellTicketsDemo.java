package com.fan.threads;

public class SellTicketsDemo {
    public static void main(String[] args) {
        SellTickets sellTickets = new SellTickets();

        Thread t1 = new Thread(sellTickets,"窗口1");
        Thread t2 = new Thread(sellTickets,"窗口2");
        Thread t3 = new Thread(sellTickets,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
