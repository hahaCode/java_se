package com.fan.generic;

/**
 * 可变参数: 又称为参数个数可变
 * 1.格式: public static int sum(int...a){}
 * 2.这里的变量其实是一个数组
 * 3.如果一个方法有多个参数, 包含可变参数, 可变参数要放在最后
 */

public class GenericDemo_03 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));

        System.out.println(sum(10, 20, 30));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(10, 20, 30, 40, 50));
    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
