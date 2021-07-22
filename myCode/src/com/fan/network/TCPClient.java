package com.fan.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        Socket socket = new Socket(InetAddress.getByName("YAHFAN-CN"), 54321);

        //获取输出流, 写数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,TCP!".getBytes());

        socket.close();

    }
}
