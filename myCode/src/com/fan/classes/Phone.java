package com.fan.classes;

public class Phone {

    /**
     * 成员变量在堆内存, 有默认的初始值
     * 局部变量没有默认的初始化值, 必须先定义, 赋值才能使用
     */
    String brand;
    int price;

    public void call () {
        System.out.println("call");
    }

    public void sendMessage () {
        System.out.println("Message");
    }

}
