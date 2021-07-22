package com.fan.inhertance;


/**
 * 继承的注意事项:
 *  1. Java中的类只支持单继承, 不支持多继承
 *  2. Java中的支持多层继承  A extends B, B extends C ...
 */
public class Zi extends Fu{

    public Zi() {
        System.out.println("子中无参构造方法被调用！");
    }
    public Zi(int num) {
        System.out.println("子中有参构造方法被调用！");
    }
}
