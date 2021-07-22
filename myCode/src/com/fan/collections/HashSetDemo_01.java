package com.fan.collections;

import java.util.HashSet;

/**
 * 哈希值: 是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值
 *        Objet的 hashCode方法可以返回对象的哈希值(默认情况下, 不同对象的哈希值是不同的;
 *        可以通过方法重写, 实现不同对象的哈希值是相同的)
 *
 * HashSet特点:
 *     1.底层数据结构是哈希表
 *     2.对集合的迭代顺序不做任何保证, 即不保证元素存储和取出的顺序一致
 *     3.没有带索引的方法, 所以不能使用普通for循环遍历
 *     4.由于是set集合, 所以是不包含重复元素的集合
 *
 */
public class HashSetDemo_01 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hi");
        hashSet.add("hai");
        hashSet.add("he");

        for(String s:hashSet){
            System.out.println(s);
        }
    }
}
