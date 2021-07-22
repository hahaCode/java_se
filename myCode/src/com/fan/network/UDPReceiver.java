package com.fan.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        //DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包, 用于接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //接收数据
        ds.receive(dp);

//        //解析数据包, 并把数据在控制台显示
//        //返回数据缓冲区
//        byte[] data = dp.getData();
//
//        //获取实际数据的长度, 并转换为字符串
//        String dataString = new String(data, 0, dp.getLength());
//
//        System.out.println("收到数据: " + dataString);
        System.out.println("收到数据: " + new String(dp.getData(), 0, dp.getLength()));

        ds.close();
    }
}
