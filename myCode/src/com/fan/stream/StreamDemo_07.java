package com.fan.stream;

import java.util.ArrayList;

/**
 * Stream流中常见的终结操作
 */
public class StreamDemo_07 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alive");
        arrayList.add("Amy");
        arrayList.add("Alen");
        arrayList.add("Charlie");
        arrayList.add("Bob");
        arrayList.add("Candy");

        //forEach 参考前面的例子

        //统计集合中有几个以"A"开头的元素, 输出统计结果
        long count = arrayList.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(count);
    }
}
