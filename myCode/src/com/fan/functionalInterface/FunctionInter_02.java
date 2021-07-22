package com.fan.functionalInterface;

/**
 * 函数式接口作为方法的参数
 *   如果方法的参数是一个函数式接口, 我们可以使用Lambda表达式作为参数传递
 */
public class FunctionInter_02 {
    public static void main(String[] args) {
        startThread(() -> System.out.println(Thread.currentThread().getName() + " start!"));
    }

    private static void startThread(Runnable r){
//        Thread t = new Thread(r);
//        t.start();

        new Thread(r).start();
    }
}
