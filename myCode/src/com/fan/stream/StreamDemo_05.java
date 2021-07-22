package com.fan.stream;

import java.util.ArrayList;

public class StreamDemo_05 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alive");
        arrayList.add("Amy");
        arrayList.add("Alen");
        arrayList.add("Charlie");
        arrayList.add("Bob");
        arrayList.add("Candy");

        //按照字母排序输出
        arrayList.stream().sorted().forEach(System.out::println);
        System.out.println("--------------");

        //按照字符串的长度
        arrayList.stream().sorted( (s1, s2) -> {
            int i = s1.length() - s2.length();
            int num = i == 0 ? s1.compareTo(s2) : i;
            return num;
        }).forEach(System.out::println);
    }
}
