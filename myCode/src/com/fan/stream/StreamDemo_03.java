package com.fan.stream;

import java.util.ArrayList;

public class StreamDemo_03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("王小二");
        arrayList.add("张小二");
        arrayList.add("李小二");
        arrayList.add("张小");
        arrayList.add("王小");
        arrayList.add("张阿三");

        //取前三个数据在控制台输出
        arrayList.stream().limit(3).forEach(System.out::println);
        System.out.println("-----------------");

        //跳过前三个元素, 把剩下的元素在控制台输出
        arrayList.stream().skip(3).forEach(System.out::println);
        System.out.println("-----------------");

        //跳过前两个元素, 取剩下元素的前三个
        arrayList.stream().skip(2).limit(3).forEach(System.out::println);
    }
}
