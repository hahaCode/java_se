package com.fan.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo_03 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //要注意主次要条件
                int num = o1.getAge() - o2.getAge();
                return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
            }
        });

        Student s1 = new Student("Anna", 12);
        Student s2 = new Student("Tony", 18);
        Student s3 = new Student("Cherry", 20);
        Student s4 = new Student("Nick", 2);
        Student s5 = new Student("Alvin", 18);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);

        for (Student s : treeSet) {
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}
