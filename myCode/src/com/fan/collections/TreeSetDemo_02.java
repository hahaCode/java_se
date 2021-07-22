package com.fan.collections;

import java.util.TreeSet;

public class TreeSetDemo_02 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

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
