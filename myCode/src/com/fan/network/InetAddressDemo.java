package com.fan.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {

        //InetAddress inetAddress = InetAddress.getByName("YAHFAN-CN");
        InetAddress inetAddress = InetAddress.getByName("192.168.56.1");

        String hostName = inetAddress.getHostName();

        String hostAddress = inetAddress.getHostAddress();

        System.out.println("主机名: " + hostName + "; IP地址是:" + hostAddress);

    }
}
