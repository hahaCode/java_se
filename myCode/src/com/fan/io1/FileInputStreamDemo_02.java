package com.fan.io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  小案例: 文件的复制粘贴
 */

public class FileInputStreamDemo_02 {
    public static void main(String[] args) throws IOException {

        //数据源
        FileInputStream fis = new FileInputStream("myCode\\fos.txt");

        //目的地
        FileOutputStream fos = new FileOutputStream("myCode\\fos2.txt");

        //读文件内容 写入另一个文件
        int by;
        while((by = fis.read()) != -1){
            fos.write(by);
        }

        //关闭资源
        fis.close();
        fos.close();
    }
}
