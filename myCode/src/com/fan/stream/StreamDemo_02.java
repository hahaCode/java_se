package com.fan.stream;


import java.util.*;
import java.util.stream.Stream;

public class StreamDemo_02 {
    public static void main(String[] args) {
        //Collection体系的集合可以使用默认方法 stream() 生成流
        List<String> arrayList = new ArrayList<>();
        Stream<String> listStream = arrayList.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        //Map体系的集合间接生成流
        Map<String,Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        //数组可以通过Stream接口的静态方法 of 生成流
        String[] arr = {"hello", "world", "java"};
        Stream<String> stringStream = Stream.of(arr);
        Stream<Integer> integerStream = Stream.of(10, 12, 20);
    }
}
