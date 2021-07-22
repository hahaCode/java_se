package com.fan.io2;

import java.io.IOException;
import java.io.PrintStream;

/**
 * 特殊操作流
 *   打印流: 只负责输出数据, 不负责读取数据, 有自己的特有方法
 */
public class PrintStreamDemo_01 {
    public static void main(String[] args) throws IOException {

        //字节打印流
        //使用指定文件名创建打印流
        PrintStream ps = new PrintStream("myCode\\ps.txt");

        //用字节输出流的方法写数据  查看的时候会转码
        ps.write(97);  //a

        //使用特有方法写数据  查看的数据原样输出
        ps.print(97); //97

        ps.close();
    }
}
