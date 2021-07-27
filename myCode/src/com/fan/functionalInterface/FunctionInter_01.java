package com.fan.functionalInterface;

/**
 * 函数式接口: 有且仅有一个抽象方法的接口(但是可以有默认或者静态方法 以及 object父类中的方法)
 *
 * JAVA的函数式编程体现的就是Lambda表达式, 所以函数式接口就是可以适用于Lambda使用的接口
 * 只有确保接口中有且仅有一个抽象方法, java中的Lambda才能顺利地进行推导
 *
 * 函数式接口注解 @FunctionalInterface
 *   自己定义函数式接口时, @FunctionalInterface是可选的, 就算不写这个注解, 满足 "有且仅有一个抽象方法的接口" 的接口都是函数式接口, 但是建议加上该注解
 */

public class FunctionInter_01 {
}
