package com.fan.polymorphism2;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat meat");
    }

    public void lookDoor() {
        System.out.println("Dog is a real watchdog");
    }
}
