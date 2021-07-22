package com.fan.myReflect;

/**
 * Java反射机制: 是指在运行时去获取一个类的变量和方法信息。然后通过获取到的信息来创建对象, 调用方法的一种机制,
 *              由于这种动态性, 可以极大的增强程序的灵活性, 程序不用在编译期就完成确定, 在运行期仍然可以扩展
 *
 * 三种方式获取Class对象
 *  1.使用类的class属性来获取该类对应的Class对象
 *  2.调用对象的getClass()方法, 返回该对象所属类对应的Class对象
 *  3.使用Class类中的静态方法forName(String className), 传入某个类的全路径, 也就是包含完整包名的路径
 */
public class MyReflectDemo_01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的class属性来获取该类对应的Class对象
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        //调用对象的getClass()方法, 返回该对象所属类对应的Class对象
        Student s = new Student();
        Class<? extends Student> sClass = s.getClass();
        System.out.println(sClass);

        //使用Class类中的静态方法forName
        Class<?> forName = Class.forName("com.fan.myReflect.Student");
        System.out.println(forName);
    }
}
