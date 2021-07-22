package com.fan.io2;

import java.io.*;

public class BufferStreamDemo_01 {
    public static void main(String[] args) throws IOException {
        //FileOutputStream fos = new FileOutputStream("myCode\\fos.txt");

        //字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myCode\\bos.txt"));
        bos.write("java\r\n".getBytes());
        bos.write("docker\r\n".getBytes());
        bos.close();

        //字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myCode\\bos.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            System.out.print(new String(bytes, 0, len));
        }
        bis.close();
    }
}
