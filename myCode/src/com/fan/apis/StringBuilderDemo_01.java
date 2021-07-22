package com.fan.apis;

/**
 * String 和 StringBuilder
 * <p>
 * 1.String 内容是不可变得
 * 2.StringBuilder 是一个可变的字符串类, 可以把它看成是一个容器, 这里的可变指的是StringBuilder对象的内容是可变的
 */

public class StringBuilderDemo_01 {
    public static void main(String[] args) {
        // 无参构造: 创建一个空白可变字符串对象, 不含有任何内容
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());

        //带参构造: 根据字符串的内容, 来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("yes");
        System.out.println("sb2:" + sb2);
        System.out.println("sb2.length():" + sb2.length());

    }
}
