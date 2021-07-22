package com.fan.innerClass2;

/**
 * 匿名内部类:
 *      前提: 存在一个类或者接口, 这里的类可以是具体类也可以是抽象类
 *      格式:
 *          new 类名或接口名(){
 *              重写方法;
 *          }
 *      本质: 是一个继承了该类或者实现了该接口的子类匿名对象
 *
 */
public class Outer {

    public void method () {
//        new MyInter() {
//            @Override
//            public void show() {
//                System.out.println("匿名内部类!");
//            }
//        };

        new MyInter() {
            @Override
            public void show() {
                System.out.println("匿名内部类!");
            }
        }.show();

        //另外一种写法

        MyInter myInter = new MyInter() {
            @Override
            public void show() {
                System.out.println("另外一种写法匿名内部类!");
            }
        };
        myInter.show();
    }
}
