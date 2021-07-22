package com.fan.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo_04 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("王小二");
        arrayList.add("张小二");
        arrayList.add("李小二");
        arrayList.add("张小");
        arrayList.add("王小");
        arrayList.add("张阿三");

        //取前4个数据组成的流
        Stream<String> stream1 = arrayList.stream().limit(4);

        //跳过前两个数据组成一个流
        Stream<String> stream2 = arrayList.stream().skip(2);

        //将之前的流合并,把结果输出
        //Stream.concat(stream1, stream2).forEach(System.out::println);
        System.out.println("--------------------");

        //将之前的流合并,把结果输出, 但要求元素不能重复
        Stream.concat(stream1, stream2).distinct().forEach(System.out::println);
    }
}
