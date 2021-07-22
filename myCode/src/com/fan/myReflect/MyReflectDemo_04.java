package com.fan.myReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射获取成员方法并使用
 */
public class MyReflectDemo_04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("com.fan.myReflect.Student");

        //返回由该Class对象表示的类或接口的所有公共方法, 包括由类或接口声明的对象以及从超类和超级接口继承的类
        Method[] methods = c.getMethods();
        for(Method m:methods) {
            System.out.println(m);
        }
        System.out.println("----------------");

        //只有本类的所有方法, 不包含继承的
        Method[] declaredMethods = c.getDeclaredMethods();
        for(Method method:declaredMethods){
            System.out.println(method);
        }
        System.out.println("----------------");

        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();

        //反射调用方法
        Method method1 = c.getMethod("method1");
        method1.invoke(obj);

        Method method2 = c.getMethod("method2", String.class);
        method2.invoke(obj, "Lily");

        Method method3 = c.getMethod("method3", String.class, int.class);
        Object  o = method3.invoke(obj, "小王", 20);
        System.out.println(o);

        Method function = c.getDeclaredMethod("function");
        function.setAccessible(true);
        function.invoke(obj);
    }
}
