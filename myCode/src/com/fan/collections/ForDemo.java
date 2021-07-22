package com.fan.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 增强for循环: 为了简化数组和Collection集合的遍历
 *            其内部原理是个迭代器
 */
public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        for(int i: arr){
            System.out.println(i);
        }
        System.out.println("-----------");

        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        for (String s : list){
            System.out.println(s);
        }
    }
}
