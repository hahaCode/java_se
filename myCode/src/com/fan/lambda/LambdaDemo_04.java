package com.fan.lambda;

public class LambdaDemo_04 {
    public static void main(String[] args) {

        useAddable((int a, int b) -> {
            return a + b;
        });
    }

    public static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
