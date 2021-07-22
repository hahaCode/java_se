package com.fan.methodReference;

/**
 * Lambda表达式支持的方法引用
 *  常见的引用方式:
 *     1.引用类方法(引用类的静态方法):  类名::静态方法
 *     2.引用对象的实例方法(引用类中的成员方法): 对象::成员方法
 *     3.引用类的实例方法(引用类中的成员方法): 类::成员方法
 *     4.应用构造器(引用构造方法): 类名::new
 *
 */
public class MethodRefDemo_01 {
    public static void main(String[] args) {

        //Lambda表达式
        useConverter(s -> Integer.parseInt(s));

        //引用类方法
        useConverter(Integer::parseInt);

        //Lambda表达式被类方法替代的时候, 它的形式参数全部传递给静态方法作为参数 (在本例中, s 就传递给了 Integer.parseInt 方法)
    }

    private static void useConverter(Converter c) {
        int num = c.convert("666");
        System.out.println(num);
    }
}
