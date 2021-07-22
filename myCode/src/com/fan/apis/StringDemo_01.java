package com.fan.apis;

public class StringDemo_01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1:" + s1);

        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        //推荐使用直接赋值的方式
        /**
         * 以 "" 方式给出的字符串, 只要字符序列相同(顺序和大小写), 无论在程序代码中出现几次, JVM 都只会建立一个String对象, 并在字符串池中维护
         * String str1 = "abc"; String str2 = "abc";
         * str1 和 str2 本质上是同一个对象
         */
        String s4 = "abc";
        System.out.println("s4:" + s4);
    }
}
