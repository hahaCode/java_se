package com.fan.method;

public class studyMethod_01 {
    public static void main(String[] args) {

        isEvenNumber(23);
        System.out.println(isEvenNumber1(20));
        System.out.println(getMaxNum(12, 78));
    }

    public static void isEvenNumber(int num) {
        if (num % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean isEvenNumber1(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getMaxNum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
