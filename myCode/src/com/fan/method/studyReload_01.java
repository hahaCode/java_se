package com.fan.method;

public class studyReload_01 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10.0, 20.5));
        System.out.println(sum(1, 2, 3));
    }
    /*
     *方法重载:
     *     1. 多个方法在同一个类中
     *     2. 多个方法具有相同的方法名
     *     3. 多个方法的参数不相同, 类型不相同, 或者数量不相同
     */

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
