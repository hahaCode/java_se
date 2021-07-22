package com.fan.myAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取注解注解中定义的属性值代替配置文件
 * 1. 获取注解定义的位置对象 (Class, method, field)
 * 2. 获取指定的注解 getAnnotation
 * 3. 调用注解中的抽象方法获取配置的属性值
 */

@MyProperty(className = "com.fan.myReflect.Teacher", methodName = "teach")
public class MyReflectDemo_06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取该类的字节码文件对象
        Class<MyReflectDemo_06> demo06Class = MyReflectDemo_06.class;

        //获取注解对象, 其实就是在内存中生成一个该注解接口的子类实现对象
        MyProperty annotation = demo06Class.getAnnotation(MyProperty.class);

        //调用注解对象中定义的抽象方法, 获取返回值
        String className = annotation.className();
        String methodName = annotation.methodName();

        //通过反射
        Class<?> c = Class.forName(className);

        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();

        Method method = c.getMethod(methodName);
        method.invoke(obj);
    }
}
