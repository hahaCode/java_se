package com.fan.network2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 客户端: 数据来自文本文件, 接收服务器的反馈
 */
public class TCPClient_03 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getByName("YAHFAN-CN"), 54321);

        //数据来自文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("myCode\\net.txt"));

        //封装输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        //结束标记
        socket.shutdownOutput();

        //接收反馈
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("我是客户端, 收到了来自服务器的反馈: " + br.readLine());

        //释放资源
        bufferedReader.close();
        socket.close();
    }
}
