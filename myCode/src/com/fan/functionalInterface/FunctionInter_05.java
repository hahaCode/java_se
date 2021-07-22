package com.fan.functionalInterface;

import java.util.function.Consumer;

/**
 * 常用的函数式接口 Consumer
 */
public class FunctionInter_05 {
    public static void main(String[] args) {
        operatorString("This is string", (String s) -> {
            System.out.println(s);
        });

        operatorString("uoy evol I", (String s) -> {
            System.out.println(new StringBuilder(s).reverse().toString());
        });

        System.out.println("----------------------");
        operatorString("王丽丽", s -> System.out.println(s), s -> System.out.println(new StringBuilder(s).reverse().toString()) );

        System.out.println("----------------------");
        String[] arr = {"小王,20", "小李,13", "小法,3"};

        printInfo(arr, s -> {
            String name = s.split(",")[0];
            System.out.print(name +", ");
        }, s -> {
            String age = s.split(",")[1];
            System.out.println(age +"岁.");
        });
    }

    //定义一个方法 消费一个字符串数据
    private static void operatorString (String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    //定义一个方法 用不同的方式消费同一个字符串数据两次
    private static void operatorString (String name, Consumer<String> consumer1, Consumer<String> consumer2) {
//        consumer1.accept(name);
//        consumer2.accept(name);

        //andThen 就等同于上面的操作
        consumer1.andThen(consumer2).accept(name);
    }

    private static void printInfo (String[] infos, Consumer<String> consumer1, Consumer<String> consumer2) {
        for(String info : infos) {
            consumer1.andThen(consumer2).accept(info);
        }
    }
}
