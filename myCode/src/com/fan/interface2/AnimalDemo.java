package com.fan.interface2;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping jumpping = new Cat();
        jumpping.jump();
        System.out.println("----------------");

        Animal animal = new Dog("Puppy", 3);
        System.out.println(animal.getName() + "," + animal.getAge());
        animal.eat();
        ((Dog) animal).jump();
        System.out.println("-----------------");

        Cat cat = new Cat("Tom", 2);
        System.out.println(cat.getName() + "," + cat.getAge());
        cat.eat();
        cat.jump();
    }
}
