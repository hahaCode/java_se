package com.fan.io2;

import java.io.*;

/**
 * 对象序列化流和对象反序列化流
 *   对象序列化: 就是将对象保存到磁盘中, 或者在网络中传输对象
 */
public class ObjectOutputStreamDemo_01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myCode\\oos.txt"));

        Student s1 = new Student("李建国",20);

        oos.writeObject(s1);

        oos.close();

        //对象反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myCode\\oos.txt"));
        Object o = ois.readObject();
        Student s = (Student) o; //向下转型
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }
}
