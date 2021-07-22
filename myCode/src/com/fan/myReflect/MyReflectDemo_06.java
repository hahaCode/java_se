package com.fan.myReflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 通过配置文件运行类中的方法
 *
 */
public class MyReflectDemo_06 {
    public static void main(String[] args) throws IOException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException {
//        Kids kids = new Kids();
//        kids.study();

        //加载数据
        Properties prop = new Properties();
        FileReader fileReader = new FileReader("myCode\\class.txt");
        prop.load(fileReader);
        fileReader.close();

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //通过反射
        Class<?> c = Class.forName(className);

        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();

        Method method = c.getMethod(methodName);
        method.invoke(obj);
    }
}
