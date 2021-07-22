package com.fan.threads;

/**
 * 线程控制  sleep
 */
public class ThreadDemo_03 {
    public static void main(String[] args) {
        MyThreadSleep t1 = new MyThreadSleep();
        MyThreadSleep t2 = new MyThreadSleep();
        MyThreadSleep t3 = new MyThreadSleep();

        t1.setName("曹操");
        t2.setName("刘备");
        t3.setName("孙权");

        t1.start();
        t2.start();
        t3.start();
    }
}
