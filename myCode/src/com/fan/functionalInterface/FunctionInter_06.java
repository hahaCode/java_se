package com.fan.functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 常用的函数式接口 Predicate
 */
public class FunctionInter_06 {
    public static void main(String[] args) {

        boolean b = checkString("hello", (String s) -> {
            return s.length() > 8;
        });

        System.out.println(b);

        System.out.println("----------------------");

        boolean b1 = checkString("hello", s -> s.length() > 3, s -> s.length() < 10);
        System.out.println(b1);

        System.out.println("----------------------");

        String[] strArray = {"小林,30", "小黑,34", "张同学,20", "李某某,38", "刘小姐,19"};
        ArrayList<String> list = myFilter(strArray, s -> {
            String name = s.split(",")[0];
            return name.length() > 2;
        }, s -> {
            String age = s.split(",")[1];
            return Integer.parseInt(age) > 18;
        });

        System.out.println(list);
    }

    //判断给定的字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> predicate) {
        //对给定的参数进行判断
//        return predicate.test(s);

        //返回一个逻辑的否定, 对应逻辑非
        return predicate.negate().test(s);  //等价于 return !predicate.test(s);
    }

    //同一个字符串给出两个不同的判断条件, 最后把这两个判断的结果做逻辑与运算的结果作为最终的结果
    private static boolean checkString(String s, Predicate<String> predicate1, Predicate<String> predicate2) {
//        boolean b1 = predicate1.test(s);
//        boolean b2 = predicate2.test(s);
//        boolean b = b1 && b2;
//        return b;

        //返回一个组合判断, 对应短路与
//        return predicate1.and(predicate2).test(s);

        //返回一个组合判断, 对应短路或
        return predicate1.or(predicate2).test(s);
    }

    private static ArrayList<String> myFilter(String[] strings, Predicate<String> predicate1, Predicate<String> predicate2) {

        ArrayList<String> result = new ArrayList<>();

        for(String s: strings) {
            if(predicate1.and(predicate2).test(s)){
                result.add(s);
            }
        }
        return result;
    }
}
