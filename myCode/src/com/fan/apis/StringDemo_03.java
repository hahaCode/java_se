package com.fan.apis;

import java.util.Scanner;

public class StringDemo_03 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Input A String:");
//        String str = sc.nextLine();

        System.out.println(arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {
        String s = "";
        s += "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i] + ", ";
            }
        }

        s += "]";
        return s;
    }
}
