package com.fan.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String s = "21 33 45 2 11 6";

        String[] strings = s.split(" ");
        int[] array = new int[strings.length];
        for(int i = 0; i < strings.length; i++){
            array[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            stringBuilder.append(array[i]);
            if(i != array.length-1) {
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
