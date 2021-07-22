package com.fan.apis;

/**
 * 比较
 *    使用 == ： 基本类型(比较的是数据值是否相同)  引用类型(比较的是地址值是否相同)
 *    字符串是对象, 比较两个字符串是否相同, 是通过 equals() 方法实现的
 */

public class StringDemo_02 {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        String s3 = "abc";
        String s4 = "abc";

        //比较字符串对象地址是否相同
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("-----------");

        //比较字符串内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
