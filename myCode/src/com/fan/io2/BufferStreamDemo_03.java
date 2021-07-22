package com.fan.io2;

import java.io.*;

/**
 * 字符缓冲流特有功能
 *  BufferedWriter: void newLine()  写一行行分割符, 行分隔符字符串由系统属性定义
 *  BufferedReader: public String readLine() 读一行文字, 结果包含行的内容的字符串, 不包括任何行终止字符, 不包含
 *                  任何行终止符, 如果流的结尾已经到达, 则为null
 */

public class BufferStreamDemo_03 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCode\\bw.txt"));
        for(int i = 0; i < 10; i++){
            bw.write("yes");
            //bw.write("\r\n");
            bw.newLine();
            bw.flush();
        }
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("myCode\\bw.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
