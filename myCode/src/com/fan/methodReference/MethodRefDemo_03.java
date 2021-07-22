package com.fan.methodReference;

public class MethodRefDemo_03 {
    public static void main(String[] args) {

        useMyString(((s, start, end) -> s.substring(start, end)));

        //引用类中的实例方法
        useMyString(String::substring);

        //Lambda表达式被类的实例方法替代时, 第一个参数作为调用者, 后面的参数全部传递给该方法作为参数
    }

    private static void useMyString(MyString string){
        String s = string.mySubString("HelloWorld", 2, 5);
        System.out.println(s);
    }
}
