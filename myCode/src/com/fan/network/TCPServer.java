package com.fan.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象
        ServerSocket serverSocket = new ServerSocket(54321);

        //监听要连接到此套接字的客户端
        Socket accept = serverSocket.accept();

        //获取输入流, 读数据, 并把数据显示在控制台
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("数据是: " + data);

        serverSocket.close();
        accept.close();  //ServerSocket close了这个肯定也close了
    }
}
