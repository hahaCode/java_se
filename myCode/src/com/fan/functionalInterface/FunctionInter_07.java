package com.fan.functionalInterface;

import java.util.function.Function;

/**
 * 常用的函数式接口 Function
 */

public class FunctionInter_07 {
    public static void main(String[] args) {
        convert("100", (String s) -> {
            return Integer.parseInt(s);
        });

        convert("100", Integer::parseInt);
        System.out.println("-------------------------");

        convert(100, n -> String.valueOf(n * 2));
        System.out.println("-------------------------");

        convert("100", s -> Integer.parseInt(s), n -> String.valueOf(n * 2));

    }

    //把字符串转成int类型, 并输出
    private static void convert(String s, Function<String, Integer> function) {
        int num = function.apply(s);
        System.out.println(num);
    }

    //定义一个方法, 把一个int类型的数据翻倍之后, 转换为字符串在控制台输出
    private static void convert(int n, Function<Integer, String> function) {
        String s = function.apply(n);
        System.out.println(s);
    }

    //定义一个方法, 把一个字符串转成int类型, 再把int类型的数据翻倍之后, 转换为字符串在控制台输出
    private static void convert(String s, Function<String, Integer> function1, Function<Integer, String> function2) {
//        int a = function1.apply(s);
//        String str = function2.apply(a);
//        System.out.println(str);

        String str = function1.andThen(function2).apply(s);
        System.out.println(str);
    }
}
