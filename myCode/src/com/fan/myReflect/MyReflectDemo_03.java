package com.fan.myReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射获取成员变量并使用
 */
public class MyReflectDemo_03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("com.fan.myReflect.Student");

        //获取所有可访问的公共字段
        Field[] fields = c.getFields();
        for (Field f:fields){
            System.out.println(f);
        }
        System.out.println("------------------");

        //获取所有的字段
        Field[] declaredFields = c.getDeclaredFields();
        for(Field field:declaredFields){
            System.out.println(field);
        }
        System.out.println("------------------");

        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();

        //获取单个字段
        Field addressField = c.getField("address");
        addressField.set(obj, "Changsha"); //给obj的成员变量addressField赋值

        //暴力反射
        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj,"路飞");

        Field ageField = c.getDeclaredField("age");
        //ageField.setAccessible(true);
        ageField.set(obj, 12);

        System.out.println(obj);

    }
}
