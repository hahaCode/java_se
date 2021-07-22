package com.fan.threads;

import javax.swing.plaf.TableHeaderUI;

/**
 * 多线程的实现方式:
 *   1.继承Thread类:
 *      定义一个MyThread类继承Thread类
 *      在MyThread类中重写run方法
 *      创建MyThread类的对象
 *      启动线程
 *
 *   2.实现Runnable接口
 *      定义一个类MyRunnable实现Runnable接口
 *      在MyRunnable类重现run方法
 *      创建MyRunnable类的对象
 *      创建Thread类的对象, 把MyRunnable对象作为构造方法的参数
 *      启动线程
 *
 * Tips：
 *  为什么要重写run方法: 因为run是用来封装被线程执行的代码
 *  run 和 start 方法的区别: run(封装线程执行的代码, 直接调用, 相当于普通方法的调用)
 *                         start(启动线程, 然后由JVM调用此线程的run方法)
 *  相比继承Thread类, 实现Runnable接口的好处: 避免了Java单继承的局限性
 *                                        适合多个相同程序的代码去处理同一个资源的情况, 把线程和程序代码、数据有效分离, 较好的体现了面向对象的思想
 *
 */
public class ThreadDemo_01 {
    public static void main(String[] args) {

        //获取main()方法所在线程的名称
        System.out.println(Thread.currentThread().getName());

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Pig");
        t2.setName("Dog");

        t1.start();
        t2.start();
    }
}
