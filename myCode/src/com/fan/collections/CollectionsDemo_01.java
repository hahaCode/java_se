package com.fan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections类是针对集合操作的工具类, 要区别于Collection接口
 */
public class CollectionsDemo_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(100);
        list.add(120);
        list.add(24);
        list.add(50);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        //使用默认的随机源随机排列指定列表 (可以模拟扑克洗牌)
        Collections.shuffle(list);
        System.out.println(list);
    }
}
