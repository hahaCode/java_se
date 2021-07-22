package com.fan.lambda;

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
