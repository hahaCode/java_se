package com.fan.io1;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 一次读取一个字节数组的方式来读取文件
 */
public class FileInputStreamDemo_03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myCode\\fos.txt");

        byte[] bytes = new byte[1024]; //一般写1024及其整数倍
        int len; //每次实际读取长度
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
    }
}
