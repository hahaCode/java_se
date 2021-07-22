package com.fan.interface3;

/**
 * 接口的继承:
 * 1.类和类: 继承关系, 只能单继承, 但是可以多层继承
 * 2.类和接口: 实现关系, 可以单实现, 也可以多实现, 还可以在继承一个类的同时实现多个接口
 * 3.接口和接口: 继承关系, 可以单继承, 也可以多继承
 */

public class InterImpl extends Object implements Inter1, Iner2, Inter3 {
}
