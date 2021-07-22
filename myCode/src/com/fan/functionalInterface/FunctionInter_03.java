package com.fan.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 函数式接口作为方法的返回值
 *   如果方法的返回值是一个函数式接口, 我们可以使用Lambda表达式作为结果返回
 */

public class FunctionInter_03 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("cccc");
        arrayList.add("aa");
        arrayList.add("b");
        arrayList.add("ddd");

        System.out.println(arrayList);

        Collections.sort(arrayList, getComparator());
        System.out.println(arrayList);
    }

    private static Comparator<String> getComparator() {

        //按照字符串长度升序排序

//        //匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };

//        //Lambda
//        return (String s1, String s2) -> {
//            return s1.length() - s2.length();
//        };

        return (s1, s2) -> s1.length() - s2.length();

    }
}
