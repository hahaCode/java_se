package com.fan.inhertance;

/**
 * 继承中变量访问的特点:
 *  1.子类局部范围找
 *  2.子类成员范围找
 *  3.父类成员范围找(不考虑父类的父类...)
 */

/**
 * 继承中成员方法的访问特点:
 *  1.子类成员范围找
 *  2.父类成员范围找 (不考虑父类的父类...)
 */

/**
 * super 和 this 关键字的用法相似
 *   this 代表本类对象的引用(this 关键字指向调用该方法的对象, 一般我们是在当前类中使用this关键字,
 *        所以我们常说的this代表本类对象的引用)
 *   super 代表父类存储空间的标识(可以理解为父类对象的引用)
 */

public class Teacher extends Human{
    public int age = 20;

    public void show(){
        int age = 25;
        System.out.println(age);

        //本类的age
        System.out.println(this.age);

        //父类的age
        System.out.println(super.age);
    }
}
