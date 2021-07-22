package com.fan.array;

public class studyArray_01 {
    public static void main(String[] args) {
        /*
         * 左边:
         *       int 数组中的元素类型是int类型
         *       []  表示这是一个数组
         *       arr 这是数组的名称
         *
         * 右边:
         *       new 申请内存空间
         *       int 数组中的元素类型是int类型
         *       []  表示这是一个数组
         *       3   数组长度, 即数组中的元素个数
         * */
//        https://www.bilibili.com/video/BV1Ei4y137HJ?p=61
        int[] arr = new int[3];

        //静态初始化
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i ++) {
            System.out.println(arr1[i]);
        }
    }
}
