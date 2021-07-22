package com.fan.array;

import java.util.Arrays;

public class studyArray_03 {

    public static void main(String[] args) {
        int[] array = {34, 23, 56, 5, 9};

        System.out.println("Before sorting:" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting:" + Arrays.toString(array));
    }
}
