package com.fan.polymorphism3;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("Cat eat fish!");
    }

    public void playGame() {
        System.out.println("Cat playGame!");
    }
}
