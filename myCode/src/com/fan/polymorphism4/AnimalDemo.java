package com.fan.polymorphism4;

/**
 * Test Class
 */

public class AnimalDemo {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.setName("加菲");
        animal.setAge(3);
        System.out.println(animal.getName() + "," + animal.getAge());
        animal.eat();

        animal = new Cat("Tom", 2);
        System.out.println(animal.getName() + "," + animal.getAge());
        animal.eat();
    }
}

// 抽象类 https://www.bilibili.com/video/BV1Ei4y137HJ?p=174&spm_id_from=pageDriver