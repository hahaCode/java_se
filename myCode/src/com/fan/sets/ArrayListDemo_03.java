package com.fan.sets;

import com.fan.classes.Student;

import java.util.ArrayList;

public class ArrayListDemo_03 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student s1 = new Student("Alvin", 12);
        Student s2 = new Student("Alison", 18);
        arrayList.add(s1);
        arrayList.add(s2);
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getName() + ":" + student.getAge());
        }
    }
}
