package com.fan.myReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射获取构造方法并使用
 */
public class MyReflectDemo_02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("com.fan.myReflect.Student");

        //获取public 的构造方法
        Constructor<?>[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("-----------------");

        //返回由该class对象表示的类声明的所有构造函数的Constructor对象
        Constructor<?>[] declaredConstructor = c.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructor) {
            System.out.println(constructor);
        }

        System.out.println("-----------------");

        //返回单个构造函数的Constructor对象
        Constructor<?> noAargs = c.getConstructor();
        //用反射创建对象
        Object obj = noAargs.newInstance();
        System.out.println(obj);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        //基本数据类型也可以通过.class得到对应的Class类型
        Constructor<?> threeArgs = c.getConstructor(String.class, int.class, String.class);
        Object o = threeArgs.newInstance("Amy", 20, "Nanjing");
        System.out.println(o);

        System.out.println("-----------------");

        //暴力反射, 正常情况下private修饰的构造函数是不能用来创建对象的, 但是反射可以
        Constructor<?> d1 = c.getDeclaredConstructor(String.class);
        d1.setAccessible(true);  //设置为true, 取消访问检查
        Object o1 = d1.newInstance("孙悟空");
        System.out.println(o1);
    }
}
