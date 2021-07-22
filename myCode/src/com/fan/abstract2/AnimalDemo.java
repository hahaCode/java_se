package com.fan.abstract2;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Cat("Tom", 2);
        System.out.println(animal.getName() + "," + animal.getAge());
        animal.eat();

        Animal animal1 = new Dog("Dudu", 3);
        System.out.println(animal1.getName() + "," + animal1.getAge());
        animal1.eat();

    }
}
