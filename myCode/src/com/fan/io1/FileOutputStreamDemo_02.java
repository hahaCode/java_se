package com.fan.io1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流写数据的两个注意点:
 *   1.字节流写数据如何换行:
 *      windows: \r\n
 *      linux: \n
 *      mac: \r
 *
 *   2.字节流写入数据如何实现追加:
 *      FileOutputStream(String name; boolean append);
 *
 */
public class FileOutputStreamDemo_02 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("myCode\\fos.txt");

        FileOutputStream fos = new FileOutputStream("myCode\\fos.txt", true);

        for(int i = 0; i <10; i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }


        fos.close();
    }
}
