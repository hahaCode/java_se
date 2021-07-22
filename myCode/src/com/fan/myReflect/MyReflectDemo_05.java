package com.fan.myReflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 利用反射实现: 在ArrayList<Integer>中添加一个字符串数据
 *
 */
public class MyReflectDemo_05 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);

        Class<? extends ArrayList> arrayListClass = arrayList.getClass();
        Method add = arrayListClass.getMethod("add", Object.class);
        add.invoke(arrayList, "hello");
        add.invoke(arrayList, "world");

        System.out.println(arrayList);
    }
}
