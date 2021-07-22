package com.fan.interface1;

/**
 * 接口的特点:
 *  1.接口用关键字interface修饰
 *  2.类实现接口用implements表示
 *  3.接口不能实例化: 参照多态的方式, 通过实现类对象实例化, 这叫接口多态
 *  4.接口的实现类: 要么重写接口中的所有抽象方法, 要么是抽象类
 *
 *
 *  接口的成员特点:
 *   1.成员变量: 只能是常量, 默认修饰符: public static final
 *   2.构造方法: 接口没有构造方法, 但是实现该接口的子类的构造方法可以调用super(); 实际上是调用了Object类的构造方法
 *   3.成员方法: 只能是抽象方法, 默认修饰符: public abstract
 *
 *  接口组成更新:
 *  1.Java8 之后, 接口中可以定义默认方法和静态方法
 *  2.Java9 之后, 接口中可以定义私有方法
 */
public interface Jump {
    int num = 10;   //等价与 public static final int num = 10;

    void show(); //等价于public abstract void show();
}
