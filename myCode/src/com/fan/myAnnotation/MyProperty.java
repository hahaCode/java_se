package com.fan.myAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用自定义注解的方式完成 MyReflectDemo_06 的功能
 *
 * 描述需要执行的类名和方法名
 *
 */

@Target({ElementType.TYPE})  //MyProperty的注解可以作用在类上
@Retention(RetentionPolicy.RUNTIME)

public @interface MyProperty {

    String className();
    String methodName();
}
