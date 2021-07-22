package com.fan.classes;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Alvin");
        s.setAge(18);
        System.out.println(s.getName() + ":" + s.getAge());

        Student s2 = new Student("Bob", 20);
        s2.showInfo();
    }
}
