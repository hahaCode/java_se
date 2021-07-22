package com.fan.sets;

import java.util.ArrayList;

/**
 * 集合类的特点:
 *     提供一种存储空间可变的存储模型, 存储的数据容量可以发生改变
 */
public class ArrayListDemo_01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("Alvin");
        arrayList.add(0, "thanks");
        System.out.println("After adding arrayList:" + arrayList);

//        arrayList.remove("thanks");
//        System.out.println("Remove objet arrayList:" + arrayList);

//        arrayList.remove(0);
//        System.out.println("Remove objet arrayList:" + arrayList);

        //修改指定索引处的元素
        arrayList.set(2, "Alison");
        System.out.println("Modify the element:" + arrayList);

        //返回索引处指定的元素
        System.out.println(arrayList.get(1));

        //返回集合中元素的个数
        System.out.println(arrayList.size());
    }
}
