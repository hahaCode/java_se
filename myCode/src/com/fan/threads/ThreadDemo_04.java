package com.fan.threads;

/**
 * 线程控制  join: 等待这个线程死亡
 */
public class ThreadDemo_04 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("皇帝");
        t2.setName("五阿哥");
        t3.setName("八阿哥");

        t1.start();
        try {
            t1.join();  //要等"皇帝驾崩", 阿哥才能开始强皇位
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
