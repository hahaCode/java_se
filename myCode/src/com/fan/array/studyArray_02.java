package com.fan.array;

public class studyArray_02 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        //reverse the array
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
