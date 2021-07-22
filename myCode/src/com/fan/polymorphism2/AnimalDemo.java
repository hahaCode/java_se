package com.fan.polymorphism2;

/**
 * 多态的好处: 提高程序的扩展性
 *      定义方法的时候, 使用父类型作为参数, 使用时, 使用具体的子类型参与操作
 * 多态的弊端: 不能使用子类的特有功能 (使用多态转型来解决这个问题 见polymorphism3)
 *
 * 多态的转型:
 *     向上转型: 从子到父 (父类引用指向子类对象)
 *     向下转型: 从父到子 (父类引用转为子类对象)
 */

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator animalOperator = new AnimalOperator();
        Cat cat = new Cat();
        animalOperator.useAnimal(cat);

        Dog dog = new Dog();
        animalOperator.useAnimal(dog);

        Pig pig = new Pig();
        animalOperator.useAnimal(pig);
    }
}
