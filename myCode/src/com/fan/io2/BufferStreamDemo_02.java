package com.fan.io2;

import java.io.*;

/**
 * 四种方式实现复制, 比较用时
 *   1.基本字节流一次读写一个字节
 *   2.基本字节流一次读写一个字节数组
 *   3.字节缓冲流一次读写一个字节
 *   4.字节缓冲流一次读写一个字节数组
 */

public class BufferStreamDemo_02{

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        //method1();   //Use 76075 ms.
        //method2();   //Use 130 ms.
        //method3();   //Use 389 ms.
        method4();    //Use 64 ms.

        long end = System.currentTimeMillis();
        System.out.println("Use " + (end-start) + " ms.");
    }

    //基本字节流一次读写一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\yahfan\\Desktop\\Music\\Full\\Natural.mp3");
        FileOutputStream fos = new FileOutputStream("myCode\\Natural.mp3");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fis.close();
        fos.close();
    }

    //基本字节流一次读写一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\yahfan\\Desktop\\Music\\Full\\Natural.mp3");
        FileOutputStream fos = new FileOutputStream("myCode\\Natural.mp3");

        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fis.close();
        fos.close();
    }

    //字节缓冲流一次读写一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\yahfan\\Desktop\\Music\\Full\\Natural.mp3"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myCode\\Natural.mp3"));

        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        bis.close();
        bos.close();
    }

    //字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\yahfan\\Desktop\\Music\\Full\\Natural.mp3"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myCode\\Natural.mp3"));

        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bis.close();
        bos.close();
    }
}
