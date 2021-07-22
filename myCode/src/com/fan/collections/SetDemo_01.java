package com.fan.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Set:
 * 1.不包含重复的元素
 * 2.没有带索引的方法, 所以不能使用普通for循环遍历
 */
public class SetDemo_01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();  //HashSet对集合的迭代顺序不作任何保证
        set.add("hello");
        set.add("yes");
        set.add("no");

        set.add("hello");
        System.out.println(set);
    }
}
