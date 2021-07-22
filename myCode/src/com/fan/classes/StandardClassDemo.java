package com.fan.classes;

public class StandardClassDemo {

    public static void main(String[] args) {
        StandardClass s1 = new StandardClass("Alvin", 12);
        s1.show();

        StandardClass s2 = new StandardClass();
        s2.setAge(18);
        s2.setName("Amy");
        s2.show();
    }
}
