package com.fan.myannotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 *
 *  当主方法执行后, 会自动执行被检测的所有方法(加了注解Check的方法), 判断方法是否有异常, 记录到文件中
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();

        //获取字节码文件对象
        Class<? extends Calculator> calculatorClass = calculator.getClass();
        //获取所有方法
        Method[] methods = calculatorClass.getMethods();

        int number = 0; //出现异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("MyTestFramework\\bug.txt"));

        //快捷键 iter
        for (Method method : methods) {
            //判断方法上是否有Check注解
            if(method.isAnnotationPresent(Check.class)) {
                //有Check注解, 就执行检查, 捕获异常
                try {
                    //method.invoke(calculatorClass);
                    Object o = method.invoke(calculator, 1, 0);
                    System.out.println(o);
                } catch (Exception e) {  //任何异常都捕获
                    //记录到文件中
                    number++;
                    bw.write(method.getName() + " 出异常了!");
                    bw.newLine();
                    bw.write("异常的名称: " + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因: "+ e.getCause().getMessage());
                    bw.newLine();
                    bw.write("--------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现" + number +"次异常");
        bw.flush();
        bw.close();
    }
}
