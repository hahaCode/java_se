package com.fan.threads;

/**
 * 线程的声明周期  图解参考当前目录下的 Thread.jpg
 */
public class ThreadDemo_06 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        //创建Thread类的对象, 把MyRunnable对象作为构造方法的参数
//        Thread t1 = new Thread(mr);
//        Thread t2 = new Thread(mr);

        Thread t1 = new Thread(mr, "cat");
        Thread t2 = new Thread(mr, "dog");

        t1.start();
        t2.start();
    }
}
