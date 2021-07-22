package com.fan.threads;

/**
 * 线程控制  setDaemon 将此线程标记为守护线程, 当运行的线程都是守护线程时, Java虚拟机将退出
 */
public class ThreadDemo_05 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("关羽");
        t2.setName("张飞");

        //设置主线程为刘备
        Thread.currentThread().setName("刘备");

        //设置守护线程, 刘备死了, 他俩也不能独活
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();

        for (int i = 0; i < 10; i++) {  // 刘备要干的事情
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
