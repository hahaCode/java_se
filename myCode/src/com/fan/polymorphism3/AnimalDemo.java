package com.fan.polymorphism3;

/**
 *多态的转型:
 *     向上转型: 从子到父 (父类引用指向子类对象)
 *     向下转型: 从父到子 (父类引用转为子类对象)
 *
 * 多态的形式:
 *     具体类多态
 *     抽象类多态
 *     接口多态
 *
 *     https://www.bilibili.com/video/BV1Ei4y137HJ?p=171&spm_id_from=pageDriver
 */

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();  //向上转型
        animal.eat();

        ((Cat)animal).playGame();  //向下转型
    }
}
