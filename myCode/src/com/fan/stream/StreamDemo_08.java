package com.fan.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream 流的收集操作
 */
public class StreamDemo_08 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("王小二");
        arrayList.add("张小二");
        arrayList.add("李小二");
        arrayList.add("张小");
        arrayList.add("王小");
        arrayList.add("张阿三");

        //得到名字为三个字的元素组成的流
        Stream<String> stream = arrayList.stream().filter(s -> s.length() == 3);
        //使用Stream流操作完毕的数据收集到List中
        List<String> names = stream.collect(Collectors.toList());
        System.out.println(names);

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(3);
        set.add(17);
        set.add(23);
        set.add(37);

        //得到大于18的元素组成的流
        Set<Integer> nums = set.stream().filter(num -> num > 18).collect(Collectors.toSet());
        System.out.println(nums);

        String[] strArray = {"小林,30", "小黑,34", "张同学,20", "李某某,38", "刘小姐,19"};

        //得到年龄大于25的流
        Stream<String> ageStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 25);
        //把使用Stream流操作完毕的数据收集到Map集合中并遍历, 字符串中的姓名做键, 年龄作值
        Map<String, Integer> map = ageStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        System.out.println(map);
    }
}
