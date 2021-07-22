package com.fan.lambda;

public class EatableImp implements Eatable{
    @Override
    public void eat() {
        System.out.println("An apple a day, the doctor keep away!");
    }
}
