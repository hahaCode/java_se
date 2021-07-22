package com.fan.network2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * TCP通信练习1：
 *    客户端: 发送数据, 接收服务器反馈
 *    服务端: 接收数据, 回一个反馈
 */
public class TCPClient_01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getByName("YAHFAN-CN"), 54321);

        //获取输出流, 发送数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("TCP Practice.".getBytes());

        //接收服务器反馈
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("I am Client, the response is: " + data);

        socket.close();
    }
}
