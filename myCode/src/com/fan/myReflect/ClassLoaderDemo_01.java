package com.fan.myReflect;

public class ClassLoaderDemo_01 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoaderParent = classLoader.getParent();
        System.out.println(classLoaderParent);
    }
}
