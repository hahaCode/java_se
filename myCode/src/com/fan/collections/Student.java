package com.fan.collections;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        //return 0;  表示元素是重复的 不会继续存储
        //按照年龄从小到大排序  (想要升序this在前, 想要降序this在后)
        int num = this.age - o.getAge();
        //年龄相同时, 按照姓名比较
        return num == 0 ? this.name.compareTo(o.getName()) : num;
    }
}
