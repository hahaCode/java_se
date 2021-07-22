package com.fan.io2;

import java.io.*;

/**
 *   InputStreamReader: 是从字节流到字符流的桥梁
 *      读取字节, 并使用指定的编码将其解码为字符
 *
 *   OutputStreamWriter: 是从字符流到字节流的桥梁
 *      使用指定的编码将写入的字符编码为字节
 */

public class ConversionStreamDemo_01 {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCode\\osw.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCode\\osw.txt"), "GBK");
        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCode\\osw.txt"), "GBK");
//        int ch;
//        while((ch = isr.read()) != -1){
//            System.out.print((char)ch);
//        }

        char[] chars = new char[1024];
        int len;
        while((len = isr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }

        isr.close();
    }
}
