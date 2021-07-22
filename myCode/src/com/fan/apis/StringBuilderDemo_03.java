package com.fan.apis;

/**
 * StringBuilder 和 String 的相互转化
 *    StringBuilder ---> String  通过toString()
 *    String ---> StringBuilder  通过构造方法 StringBuilder(String S)
 */

public class StringBuilderDemo_03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("test");
        String s = sb.toString();  //将StringBuilder 转化为String
        System.out.println(s);

        String s1 = "hehe";
        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(sb1);
    }
}
