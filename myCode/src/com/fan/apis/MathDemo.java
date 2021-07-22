package com.fan.apis;

public class MathDemo {
    public static void main(String[] args) {

        //绝对值函数
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("------------------");

        //向上取double
        System.out.println(Math.ceil(12.34));

        //向下取double
        System.out.println(Math.floor(12.56));
        System.out.println("------------------");

        //四舍五入返回整数
        System.out.println(Math.round(12.3F));
        System.out.println("------------------");

        //返回两个值的较大较小值
        System.out.println(Math.max(88, 66));
        System.out.println(Math.min(88, 66));
        System.out.println("------------------");

        //返回a的b次幂
        System.out.println(Math.pow(2.0, 3.0));
        System.out.println("------------------");

        //产生一个随机数 double类型  [0.0, 1.0) 取不到1.0
        System.out.println(Math.random());
    }
}
