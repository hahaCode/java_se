package com.fan.collections;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet 集合概述和特点:
 *  1.哈希表和链表实现的Set接口, 具有可预测的迭代次序
 *  2.由链表保证元素有序, 也就是说元素的存储和取出顺序是一致的
 *  3.由哈希表保证元素唯一, 也就是说没有重复的元素
 */

public class HashSetDemo_02 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");

        for (String s:linkedHashSet){
            System.out.println(s);
        }
    }
}
