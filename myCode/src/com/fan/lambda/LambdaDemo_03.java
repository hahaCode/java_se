package com.fan.lambda;

public class LambdaDemo_03 {
    public static void main(String[] args) {

        useFlyable( (String s) -> {
            System.out.println(s);
        });
    }

    private static void useFlyable(Flyable flyable) {
        flyable.fly("hello");
    }
}
