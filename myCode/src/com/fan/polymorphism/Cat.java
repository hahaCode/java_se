package com.fan.polymorphism;

public class Cat extends Animal{

    public int age = 20;
    public int weight = 40;

    @Override
    public void eat() {
        System.out.println("Cats eat fish");
    }

    public void play() {
        System.out.println("Cats play");
    }
}
