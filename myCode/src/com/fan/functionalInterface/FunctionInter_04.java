package com.fan.functionalInterface;

import java.util.function.Supplier;

/**
 * 常用的函数式接口 Supplier 代表结果供应商
 */
public class FunctionInter_04 {
    public static void main(String[] args) {

        String s = getString(() -> "hello");
        System.out.println(s);

        Integer num = getInteger(() -> 2);
        System.out.println(num);

        System.out.println("-----------------");

        int[] arr = {2, 334, 54, 6, 77};
        int maxValue = getMax(() -> {
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }

            return max;
        });
        System.out.println(maxValue);
    }

    private static String getString(Supplier<String> supplier) {
        return supplier.get();
    }

    private static Integer getInteger(Supplier<Integer> supplier) {
        return supplier.get();
    }

    //返回一个int数组中的最大值
    private static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
