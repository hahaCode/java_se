package com.fan.myannotation;

import com.sun.source.tree.BreakTree;

/**
 * 一个简单的计算器类
 */
public class Calculator {

    @Check
    public int add(int a, int b) {
        return a + b;
    }

    @Check
    public int sub(int a, int b) {
        return a - b;
    }

    @Check
    public int mul(int a, int b) {
        return a * b;
    }

    @Check
    public int div(int a, int b) {
        return a / b;
    }

    public void show(){
        System.out.println("This is the method of Calculator....");
    }
}
