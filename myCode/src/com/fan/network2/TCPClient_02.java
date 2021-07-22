package com.fan.network2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 客户端: 数据来自键盘录入, 直到输入的是886, 数据发送结束
 */
public class TCPClient_02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getByName("YAHFAN-CN"), 54321);

        //数据来自键盘输入
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        //或者数据来自文件
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("myCode\\net.txt"));

        //封装输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if("886".equals(line)) {
                break;
            }

            //获取输出流对象
//            OutputStream outputStream = socket.getOutputStream();
//            outputStream.write(line.getBytes());

            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedReader.close();
        socket.close();
    }
}
