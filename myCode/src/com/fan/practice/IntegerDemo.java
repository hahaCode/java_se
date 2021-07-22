package com.fan.practice;

/**
 * 基本数据类型的包装类
 *     基本数据类型包装类的最常见操作就是: 用于基本类型和字符串之间的相互转换
 */

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf("120");
        System.out.println("i1:" + i1 + ", i2:" + i2);
        System.out.println("---------------------");
        //int <---> String

        //int 转 String的两种方法
        int num = 10;
        String s1 = "" + num;
        System.out.println(s1);

        String s2 = String.valueOf(num);   // valueOf常用, 是String类中的方法
        System.out.println(s2);
        System.out.println("---------------------");
        //String 转 int

        //String --> Integer --> int
        String s = "520";
        Integer integer = Integer.valueOf(s);
        System.out.println(integer.intValue());

        //String ---> int
        System.out.println(Integer.parseInt(s));  //parseInt常用, 是Integer类中的方法
    }
}
