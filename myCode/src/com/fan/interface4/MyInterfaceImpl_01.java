package com.fan.interface4;

public class MyInterfaceImpl_01 implements MyInterface{

    //实现一个接口, 它里面的抽象方法是必须要重写的
    @Override
    public void show1() {
        System.out.println("MyInterfaceImpl_01 --- show1");
    }

    @Override
    public void show2() {
        System.out.println("MyInterfaceImpl_01 --- show2");
    }

    //接口中默认方法可以按照需要决定是否重写, 如果要重写的话, 要去掉default关键字
    @Override
    public void show3() {
        System.out.println("MyInterfaceImpl_01 --- show3");
    }
}
