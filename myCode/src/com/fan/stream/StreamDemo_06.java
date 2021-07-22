package com.fan.stream;

import java.util.ArrayList;

public class StreamDemo_06 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("12");
        arrayList.add("13");
        arrayList.add("11");
        arrayList.add("1");
        arrayList.add("10");
        arrayList.add("6");

        //将集合中的字符串转为int并输出
        arrayList.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
        System.out.println("----------------");
        arrayList.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        System.out.println("----------------");

        //返回此流中元素的总和
        int sum = arrayList.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
