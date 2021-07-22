package com.fan.drinkmilk;

public class MilkBoxDemo {
    public static void main(String[] args) {
        //创建奶箱对象, 这是共享数据区域
        Box box = new Box();

        //创建生产者对象, 把奶箱对象作为构造方法参数传递, 因为在这个类中要调用存储牛奶的操作
        Producer producer = new Producer(box);

        //创建消费者对象, 把奶箱对象作为构造方法参数传递, 因为在这个类中要调用获取牛奶的操作
        Costomer costomer = new Costomer(box);

        //创建两个线程代表生产者和消费者
        Thread p = new Thread(producer);
        Thread c = new Thread(costomer);

        p.start();
        c.start();
    }
}
