package com.fan.io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream: 从文件系统中的文件获取输入字节
 */
public class FileInputStreamDemo_01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myCode\\fos.txt");

        int by;
        while((by = fis.read()) != -1) {
            System.out.print((char) by);
        }

        fis.close();
    }
}
