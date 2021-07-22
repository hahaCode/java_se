package com.fan.method;

public class studyPassingValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("before change:" + arr[1]);
        change(arr);
        System.out.println("after change:" + arr[1]);
    }

    public static void change(int[] arr) {

        arr[1] = 5;
    }
}
