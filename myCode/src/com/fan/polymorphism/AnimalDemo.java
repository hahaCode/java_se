package com.fan.polymorphism;

/**
 * 多态的前提和体现:
 *      有继承/实现关系
 *      有方法重写
 *      有父(类/接口)引用指向(子/实现)类对象
 *
 * 多态中成员访问的特点:
 *     成员变量: 编译看左边, 执行看左边
 *     成员方法: 编译看左边, 执行看右边
 *     (成员变量和成员方法的访问为啥不一样, 因为成员方法有重写, 而成员变量没有)
 *
 * 多态的优点和弊端  见polymorphism2
 */

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        System.out.println(animal.age);
        animal.eat();
    }
}
