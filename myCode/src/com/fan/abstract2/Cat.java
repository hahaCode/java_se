package com.fan.abstract2;

public class Cat extends Animal{

    public Cat() {
        super();
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat fish!");
    }
}
