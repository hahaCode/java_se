package com.fan.drinkmilk;

/**
 * Box 奶箱类
 */
public class Box {

    //定义一个成员变量, 表示第x瓶奶
    private int milk;

    //定义一个成员变量表示奶箱的状态, false表示没有牛奶
    private boolean state = false;

    //提供存储牛奶和获取牛奶的操作
    public synchronized void put(int milk) {

        //如果有牛奶要等待消费者消费
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果奶箱里没有牛奶, 就往里放牛奶
        this.milk = milk;
        System.out.println("第" + this.milk + "瓶牛奶被放入奶箱.");

        //放入牛奶后修改状态
        state = true;

        //唤醒其他等待的线程
        notifyAll();
    }

    public synchronized void get() {

        //如果奶箱里没有牛奶, 就要等待
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶就消费
        System.out.println("我拿走了第" + this.milk + "瓶奶.");

        //消费完之后, 要修改奶箱状态
        state = false;

        //唤醒其他等待的线程
        notifyAll();
    }
}