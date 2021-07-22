package com.fan.collections;

/**
 * Collection 集合常用方法:
 *      1.add
 *      2.remove
 *      3.clear  清空集合所有元素
 *      4.contains(Object o)  判断集合中是否存在指定元素
 *      5.isEmpty
 *      6.size  集合的长度也就是集合中元素的个数
 *
 * Collection集合的遍历
 *      Iterator: 迭代器, 集合的专用遍历方式
 *
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo_01 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("hello");
        collection.add("hello");
        collection.add("nihao");

        System.out.println(collection);
        System.out.println("-------------Iterator-------------");
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
