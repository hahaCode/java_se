package com.fan.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 判断多线程程序是否会有数据安全的问题:
 *   1.是否是多线程环境
 *   2.是否有共享数据
 *   3.是否有多条语句操作共享数据
 *
 * 解决多线程安全问题: 把多条语句操作共享数据的代码锁起来, 让任意时刻只能有一个线程执行即可
 *
 * Lock实现了提供比使用synchronized方法和语句可以获得更广泛的锁定操作
 */
public class SellTickets implements Runnable {

    //这个是有问题, 1.会出现一张票被卖多次 2.票已经卖完了, 还在出售票
//    private int tickets = 100;
//    @Override
//    public void run() {
//        while (true) {
//            if (tickets > 0) {
//                try {
//                    Thread.sleep(100);  //模拟出票时间
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - tickets) + "张票!");
//                tickets--;
//            } else {
//                System.out.println("票已经卖空了!");
//                break;
//            }
//        }
//    }
    //-----------------------------------------------------------------------------------------------------
//    private int tickets = 100;
//    private Object o = new Object();
//    //锁多条语句操作共享数据, 可以使用同步代码块实现
//    /*
//        synchronized (任意对象) {  //相当于是给代码加了锁, 任意对象就可以看成是一把锁; 要注意所有线程应该共用一把锁, 所以不能 synchronized (new Object())
//
//        }
//        优点: 解决了多线程的数据安全问题
//        缺点: 当线程很多时, 因为每个线程都会去判断同步代码块上的锁, 这是很耗费资源的, 会降低程序的运行效率
//     */
//    @Override
//    public void run() {
//        while (true) {
//            synchronized (o) {
//                if (tickets > 0) {
//                    try {
//                        Thread.sleep(100);  //模拟出票时间
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - tickets) + "张票!");
//                    tickets--;
//                } else {
//                    System.out.println("票已经卖空了!");
//                    break;
//                }
//            }
//        }
//    }

    //-------------------------------------------------------------------------------------------

//    //同步方法
//    /*
//        同步非静态方法:
//            修饰符 synchronized 返回值类型 方法名(方法参数) {}
//            非静态同步方法的锁对象是 this
//
//        同步静态方法：
//            修饰符 static synchronized 返回值类型 方法名(方法参数) {}
//            同步静态方法的锁对象是 类名.class
//     */
//
//    private int tickets = 100;
//    private Object o = new Object();
//
//    @Override
//    public void run() {
//        while (true) {
//            sellTicket();
//        }
//    }
//
//    private synchronized void sellTicket() {
//        if (tickets > 0) {
//            try {
//                Thread.sleep(100);  //模拟出票时间
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - tickets) + "张票!");
//            tickets--;
//        }
//    }

    //------------------------------------------------------------------------------------------------

//    //同步静态方法
//    private static int tickets = 100;
//    private Object o = new Object();
//
//    @Override
//    public void run() {
//        while (true) {
//            sellTicket();
//        }
//    }
//
//    private static synchronized void sellTicket() {
//        if (tickets > 0) {
//            try {
//                Thread.sleep(100);  //模拟出票时间
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - tickets) + "张票!");
//            tickets--;
//        }
//    }

    //--------------------------------------------------------------------------------------------------

    //Lock是接口不能直接实例化, 这里采用它的实现类ReentrantLock来实例化
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //一般是将操作共享数据的代码放到try里, finally里释放锁, 这样即使里面代码操作时有问题, 锁也会被释放
            try {
                lock.lock(); //加锁
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);  //模拟出票时间
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - tickets) + "张票!");
                    tickets--;
                }
            }finally {
                lock.unlock();//释放锁
            }
        }

    }
}
