package com.fan.lambda;

/**
 * Lambda表达式的省略
 */
public class LambdaDemo_05 {
    public static void main(String[] args) {

        //参数的类型可以省略
        useAddable( (a, b) -> {
            return a + b;
        });

        //如果有且仅有一个参数, 包裹参数的小括号也可以省略
        useFlyable( s -> {
            System.out.println(s);
        });

        //如果代码块的语句只有一条可以省略大括号和分号 (如果有return关键字, return也要省略掉)
        useFlyable( s -> System.out.println(s));

        useAddable( (a, b) -> a + b);
    }

    public static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }

    private static void useFlyable(Flyable flyable) {
        flyable.fly("hello");
    }
}
