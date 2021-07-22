package com.fan.innerClass;

/**
 * 内部类的访问特点:
 *  1.内部类可以直接访问外部类的成员, 包括私有
 *  2.外部类要方位内部类的成员, 必须创建对象
 *
 * 内部类的类型:
 *  1.成员内部类
 *  2.局部内部类: 局部内部类是在方法中定义的类, 所以外界是无法直接使用的, 需要在方法内部创建对象并使用
 *              该类可以直接访问外部类的成员, 也可以访问方法内的局部变量
 */

public class Outer {

    private int num = 10;

    //对于public修饰的成员内部类, 在其他类里面怎么访问呢?  Outer.Inner oi = new Outer.new Inner();  oi.show();

//    public class Inner {
//        public void show () {
//            System.out.println(num);
//        }
//    }

    //成员内部类
    //一般是不会用public修饰成员内部类的, 而用private, 然后再写一个成员方法创建内部类的对象, 这样在其他类里访问时直接创建外部类的对象, 调用该成员方法

    private class Inner {
        public void show() {
            System.out.println("成员内部类: Inner," + num);
        }
    }

    public void method() {
        Inner inner = new Inner();
        inner.show();
    }

    //局部内部类
    public void method2() {
        int num2 = 20;
        class Inner2 {
            public void show() {
                System.out.println("局部内部类: Inner2," + num);
                System.out.println("局部内部类: Inner2," + num2);
            }
        }

        Inner2 inner2 = new Inner2();
        inner2.show();
    }
}
