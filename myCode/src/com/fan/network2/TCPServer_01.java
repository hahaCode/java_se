package com.fan.network2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP通信练习1：
 *    客户端: 发送数据, 接收服务器反馈
 *    服务端: 接收数据, 回一个反馈
 */
public class TCPServer_01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(54321);

        //监听客户端连接
        Socket accept = serverSocket.accept();

        //获取输入流, 读数据, 并把数据显示在控制台上
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("I am Server, the data from client is :" + data);

        //给出反馈
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("Got it".getBytes());

        serverSocket.close();
    }
}
