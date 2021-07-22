package com.fan.io2;

import java.io.*;

public class CopyFileWithBufferedStream {
    public static void main(String[] args) throws IOException {

        //根据数据源创建字符
        BufferedReader br = new BufferedReader(new FileReader("myCode\\fos.txt"));

        //根据目的地创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCode\\bw-copy.txt"));

        //一次读一个字符
//        int ch;
//        while ((ch = br.read()) != -1){
//            bw.write(ch);
//        }

        //一次读一个字符数组
//        char[] chars = new char[1024];
//        int len;
//        while ((len = br.read(chars)) != -1) {
//            bw.write(chars, 0, len);
//        }

        //使用字符缓冲流的特有功能
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
