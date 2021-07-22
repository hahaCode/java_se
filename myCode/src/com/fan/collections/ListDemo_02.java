package com.fan.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator 允许沿任一方向遍历列表的列表迭代器, 在迭代期间修改列表, 在迭代期间修改列表,
 *              并获取列表中迭代器的当前位置
 *
 */

public class ListDemo_02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("dog");
        list.add("cat");

        System.out.println(list);

        System.out.println("------------正向遍历--------------");
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("------------逆向遍历--------------");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        //对比Iterator的一个案例  com.fan.myException  ---> ExceptionDemo_02
        System.out.println("--------------对比Iterator--------------");
        while (listIterator.hasNext()){
            if(listIterator.next().equals("dog")) {
                listIterator.add("wangwang");
            }
        }

        System.out.println(list);
    }
}
