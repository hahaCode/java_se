package com.fan.lambda;

/*
    Lambda表达式基础语法:

    ()  参数列表
    ->  分隔作用
    {}  方法体

 */


public class LambdaDemo_01 {
    public static void main(String[] args) {

        //采用匿名内部类启动线程
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("线程已启动!");
//            }
//        }).start();

        //Lambda表达式的方式改进
        new Thread(() -> {
            System.out.println("线程已启动!");
        }).start();
    }
}
