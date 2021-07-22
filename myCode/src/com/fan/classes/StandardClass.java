package com.fan.classes;

public class StandardClass {
    /**
     * 类的标准写法:
     * 1.成员变量: 使用private修饰
     * 2.构造方法: 提供一个无参构造方法; 提供一个带多个参数的构造方法
     * 3.成员方法: 对每一个成员变量对应的getter和setter访问器; 提供一个显示对象信息的show()方法
     * <p>
     * 测试类标准类:
     * 1.创建对象并为其成员变量赋值
     * 无参构造方法创建对象后使用setter赋值
     * 使用带参数的构造方法直接创建带有属性值的对象
     */

    private String name;
    private int age;

    public StandardClass() {

    }

    public StandardClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void show() {
        System.out.println(this.name + ", " + this.age);
    }
}
