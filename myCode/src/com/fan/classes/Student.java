package com.fan.classes;

public class Student {

    private String name;
    private int age;

    /**
     * 构造方法的创建
     *    如果没有定义构造方法,系统将给出一个默认的无参数的构造方法
     *    如果定义了构造方法, 系统将不再提供默认的构造方法
     *
     * 构造方法的重载
     *     如果定义带参的构造方法, 还要使用无参数构造方法, 就必须自己写一个无参构造方法
     *
     * 推荐写法
     *     无论是否使用无参构造方法, 都手工书写无参数的构造方法
     */

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 1.this 修饰的变量用于指代成员变量
     *   方法的形参如果与成员变量同名, 不带this修饰的变量指的是形参, 而不是成员变量
     *   方法的形参没有与成员变量同名，不带this修饰的变量指的是成员变量
     *
     * 2.this解决什么问题
     *   解决局部变量隐藏成员变量的问题
     *
     * 3.this: 代表所在类的对象引用
     *   方法被哪个对象调用, this就代表哪个对象
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("error age");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void showInfo() {
        System.out.println(this.name+"," +this.age);
    }
}
