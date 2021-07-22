package com.fan.practice;

/**
 * 自动装箱和拆箱:
 * 1.装箱: 把基本数据类型转换为对应的包装类型
 * 2.拆箱: 把包装类类型转换为对应的基本数据类型
 */

public class PackingOrUnPacking {
    public static void main(String[] args) {
        //装箱
        Integer integer = Integer.valueOf(100);
        //自动装箱
        Integer integer1 = 120;

        //拆箱
        System.out.println(integer.intValue());
        //自动拆箱
        System.out.println(integer1 + 200);
    }
}
