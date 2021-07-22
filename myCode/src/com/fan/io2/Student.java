package com.fan.io2;

import java.io.Serializable;

/**
 * 1.如果一个对象需要被序列化或者反序列化, 那么该对象所属的类就要实现Serializable接口
 * 2.Serializable是一个标记接口, 实现该接口, 不需要重写任何方法
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 42L;  //显示声明 serialVersionUID

    private String name;
    private transient int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
