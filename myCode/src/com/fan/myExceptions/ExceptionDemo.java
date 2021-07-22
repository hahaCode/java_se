package com.fan.myExceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Java中的异常被分为两大类: 编译时异常和运行时异常, 也被称为受检异常和非受检异常
 * 所有的RuntimeException类及其子类被称为运行时异常, 其他的异常都是编译时异常
 *
 * 异常的处理:
 * 1.try/catch
 *     try{
 *         //可能出异常的代码
 *     } catch (异常类名 变量名) {
 *         //异常的处理代码
 *     } finally {
 *         //执行所有清除操作
 *     }
 *
 * 2.throws
 *
 * throws 和 throw的区别
 * throws: 用在方法声明后面, 跟的是异常类名
 *         表示抛出异常, 由该方法的调用者来处理
 *         表示出现异常的一种可能性, 并不一定会发生这些异常
 * throw: 用在方法体内, 跟的是异常对象名
 *        表示抛出异常, 由方法体内的语句处理
 *        执行throw一定是抛出了某种异常
 */

public class ExceptionDemo {
    public static void main(String[] args) {
        method1();
        method2();
    }

    // 运行时异常
    public static void method1() {
        int [] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }

    //编译时异常, 有可能会出异常, 不是一定出异常
    public static void method2(){
        String s = "2021-05-20";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }
}
