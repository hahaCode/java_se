package com.fan.stream;

import java.util.ArrayList;

/**
 * Stream流的生成方式
 *   Stream流的使用:
 *     生成流(通过数据源, 集合、数组等, 生成流) list.stream()
 *     中间操作(一个流后面可以跟随零个或多个中间操作, 其目的主要是打开流, 做出某种程度的数据过滤/映射, 然后返回一个新的流, 交给下一个操作使用)  filter()
 *     终结操作(一个流只能有一个终结操作, 当这个操作执行后, 流就被使用"光"了, 无法再被操作)  forEach()
 *
 *   Stream流的常见生成方式
 *     Collection体系的集合可以使用默认方法 stream() 生成流
 *     Map体系的集合间接生成流
 *     数组可以通过Stream接口的静态方法 of 生成流
 */
public class StreamDemo_01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("王小二");
        arrayList.add("张小二");
        arrayList.add("李小二");
        arrayList.add("张小");
        arrayList.add("王小");
        arrayList.add("张阿三");

        //用stream来筛选出以"张"为开头, 且长度为3的字符串
        arrayList.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

    }
}
