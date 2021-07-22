package com.fan.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List 集合概述和特点
 *     1.有序集合(也称为序列), 用户可以精确控制列表中每个元素的插入位置, 用户可以通过证书索引访问元素, 并搜索列表中的元素
 *     2.与Set集合不同, 列表允许重复的元素
 *
 * 特点:
 *     1.有序: 存储和取出的元素顺序一致
 *     2.可重复: 存储的元素可以重复
 */

public class ListDemo_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("hello");
        list.add("cat");
        list.add(0, "first");  //添加的时候注意索引不能越界

        System.out.println(list);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

//https://www.bilibili.com/video/BV1Ei4y137HJ?p=228&spm_id_from=pageDriver