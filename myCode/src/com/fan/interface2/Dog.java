package com.fan.interface2;

public class Dog extends Animal implements Jumpping{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog eat meat!");
    }

    @Override
    public void jump() {
        System.out.println("Dog can jump!");
    }
}
