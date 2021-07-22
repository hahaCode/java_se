package com.fan.apis;

public class StringBuilderDemo_02 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        //StringBuilder append(任意类型) 添加数据, 并返回对象本身
//        StringBuilder sb2 = sb.append("hello");
//
//        System.out.println("sb:" + sb);
//        System.out.println("sb2:" + sb2);
//        System.out.println(sb == sb2);  //true

        //链式编程
        sb.append("I").append(" am").append(" so").append(" sad").append(" 666");
        System.out.println("sb:" + sb);

        //StringBuilder reverse(), 反转字符序列
        sb.reverse();
        System.out.println("After Reverse:" + sb);
    }
}
