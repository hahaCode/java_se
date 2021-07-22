package com.fan.threads;

/**
 * 获取和设置线程的名称
 *  setName 设置线程名称
 *  getName 设置线程名称
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
