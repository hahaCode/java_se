package com.fan.package_test;

/**
 * 包的概述和使用:
 *     1.其实就是文件夹, 对类进行分类管理
 *     2.带包的Java类编译和执行
 *      - 手动建包: 按照以前的格式编译java文件,  javac Hello.java
 *                 手动创建包, 如在E盘建立文件夹com, 然后在com下建立文件夹test
 *                 把class文件放到包里,  把Hello。class文件放到com下的test文件夹下
 *                 带包执行  java com。test。Hello
 *      -自动建包: javac -d 。 Hello。java   ---->  java com.test.Hello
 */
//https://www.bilibili.com/video/BV1Ei4y137HJ?p=162&spm_id_from=pageDriver
public class PackTest {
    public static void main(String[] args) {
        System.out.println("Yes!");
    }
}
/**
 *
 * 访问权限修饰符
 *
 * 修饰符      同一个类中       同一个包中的子类/无关类        不同包的子类      不同包的无关类
 * private       √
 *  默认          √                 √
 * protected     √                  √                        √
 * public        √                  √                        √               √
 */

/**
 * 状态修饰符
 * final: 可以修饰成员变量(不能被再次赋值), 成员方法(不能被重写), 类(不能被继承)
 *        final修饰基本类型---数据值不能发生改变
 *        final修饰引用类型---引用类型的地址不能发生改变, 但是地址里面的内容是可以发生改变的
 *
 * static 可以修饰成员方法, 成员变量
 *        static修饰的特点---被类所有的对象共享(这也是我们判断是否使用静态关键字的条件); 可以通过类名调用
 *        static访问的特点(静态成员方法只能访问静态成员)---非静态的成员方法(能访问静态的成员变量/方法, 也能访问非静态的成员变量、方法)
 *                                                   静态的成员方法(只能访问静态的成员变量/方法)
 *
 */
