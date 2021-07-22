package com.fan.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) throws IOException {

        //DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口
        DatagramSocket ds = new DatagramSocket();

        //创建数据, 并把数据打包
        //构造一个数据包, 发送长度为length的数据包到指定主机的指定端口号

        byte[] bytes = "hello,udp".getBytes();

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("YAHFAN-CN"), 10086);

        //调用DatagramSocket对象的方法发送数据
        ds.send(dp);

        //关闭发送端
        ds.close();
    }
}
