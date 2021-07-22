package com.fan.io1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        //数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\yahfan\\Desktop\\cat.jpg");
        //目的地
        FileOutputStream fos = new FileOutputStream("myCode\\cat.jpg");

        //读写数据复制图片
        byte[] bytes = new byte[1024];

        int len;
        while((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fis.close();
        fos.close();
    }
}
