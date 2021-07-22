package com.fan.apis;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("Start");

        //exit(int status) 终止当前运行的Java虚拟机, 非零表示异常终止
        //System.exit(0);
        System.out.println("End");
        System.out.println(System.currentTimeMillis());  //当前时间和1970年1月1日相差的毫秒值
        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365); //当前和1970.1.1相差多少年

        //下面循环一共执行了多长时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时: " + (end - start) + "ms");
    }
}

//https://www.bilibili.com/video/BV1Ei4y137HJ?p=196&spm_id_from=pageDriver