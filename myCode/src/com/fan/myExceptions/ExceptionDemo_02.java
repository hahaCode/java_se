package com.fan.myExceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 并发修改异常 ConcurrentModificationException
 * https://www.bilibili.com/video/BV1Ei4y137HJ?p=229&spm_id_from=pageDriver
 *
 * 该案例中抛出ConcurrentModificationException的原因:
 *   1.modCount  实际修改集合的次数   !=    expectedModCount: 预期修改集合的次数
 *   2.迭代器遍历过程中, 通过集合对象修改了集合元素的长度, 造成了迭代器获取元素中判断预期修改值和实际
 *     修改值不一致
 *
 * 解决方法:
 *   换做for循环操作, 而不用Iterator
 *
 */
public class ExceptionDemo_02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("I");
        list.add("love");
        list.add("you");

        //要求: 如果列表中有 "love" 就再添加一个元素"@@"
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String s = iterator.next();   // ConcurrentModificationException
//
//            if(s.equals("love")){
//                list.add("@@");
//            }
//        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals("love")) {
                list.add("@@");
            }
        }
        System.out.println(list);
    }
}
