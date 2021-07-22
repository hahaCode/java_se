package com.fan.io2;

import java.io.*;

/**
 *  1.用对象序列化流序列化了一个对象后, 假如修改了对象所属的类文件, 会有问题  ---> 解决方案: 显示声明 private static final long serialVersionUID
 *  2.如果一个对象中的某个成员变量的值不想被序列化, 怎么办  ---> 解决方案: 用transient修饰该成员变量
 */
public class ObjectOutputStreamDemo_02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //write();
        read();
    }

    //序列化
    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myCode\\oos.txt"));
        Student s1 = new Student("李建国", 20);
        oos.writeObject(s1);
        oos.close();
    }

    //反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myCode\\oos.txt"));
        Object o = ois.readObject();
        Student s = (Student) o; //向下转型
        System.out.println(s.getName() + "," + s.getAge());
        ois.close();
    }
}
