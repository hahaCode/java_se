package com.fan.polymorphism2;

public class AnimalOperator {
/*
    public void useAnimal(Cat c) {
        c.eat();
    }

    public void useAnimal(Dog d) {
        d.eat();
    }
*/
    //和上面两个效果一样
    public void useAnimal(Animal a) {
        a.eat();
       // a.lookDoor(); 报错  不能访问某个子类特有的成员方法
    }
}
