package com.fan.interface4;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterfaceImpl_01();
        myInterface.show1();
        myInterface.show2();
        myInterface.show3();

        //接口中的静态方法只能通过接口名调用, 不能通过实现类或者对象名调用
        MyInterface.show4();
        System.out.println("---------------------");

        myInterface.test1();
        MyInterface.test2();
    }
}
