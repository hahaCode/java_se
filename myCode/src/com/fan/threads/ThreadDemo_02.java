package com.fan.threads;
/**
 * 线程调度的两种模型 (Java使用的是抢占式调度模型)
 *   1.分时调度模型: 所有线程轮流使用CPU的使用权, 平均分配每个线程占用CPU的时间片
 *   2.抢占式调度模型：优先让优先级高的线程使用CPU, 如果线程的优先级相同, 那么会随机选择一个, 优先级高的线程获取的Cpu时间片相对较多
 */
public class ThreadDemo_02 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Car");
        t2.setName("Plane");

        //默认的线程优先级是5  最高10 最低1
        //优先级高仅仅是获取CUP时间片的机率高, 不一定每次都要跑在最前面
        t1.setPriority(2);
        t2.setPriority(8);

        t1.start();
        t2.start();
    }
}
