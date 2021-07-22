package com.fan.io1;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流分类:
 *   1. 按照数据的流向: 输入流(读数据) 输出流(写数据)
 *   2. 按照数据类型来分: 字节流  字符流
 *
 * 字节流和字符流分别在什么情况下使用:
 *   1.(简单区别) 如果通过windows自带的记事本打开, 可以读懂里面的内容, 如文本, 就使用字符流; 否则使用字节流(如图片); 分不清的时候也选字节流
 *   2.由于字节流操作中文不是很方便(可以操作), 所以JAVA就提供了字符流, 字符流 = 字节流 + 编码表
 */

public class FileOutputStreamDemo_01 {
    public static void main(String[] args) throws IOException {
         FileOutputStream fos = new FileOutputStream("myCode\\fos.txt");

         fos.write(97);

         //byte[] bys = {97, 98, 99};
         //返回字符串对应的字节数组
        byte[] bys = "abcdef".getBytes();
        //fos.write(bys);

        fos.write(bys, 1, 3);

         //IO操作最后都要释放资源
        fos.close(); //关闭此文件输出流并释放与此流相关联的任何系统资源
    }
}
