package com.fan.io2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 */
public class PrintWriterDemo_01 {
    public static void main(String[] args) throws IOException {
        //字符打印流  true表示自动调用flush方法
        PrintWriter pw = new PrintWriter(new FileWriter("myCode\\pw.txt"), true);
        pw.println("yes-noflush");
        pw.close();
    }
}
