package com.fan.network2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端: 接收到的数据在控制台输出
 *
 */
public class TCPServer_02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(54321);

        Socket accept = serverSocket.accept();

        //获取输入流
//        InputStream inputStream = accept.getInputStream();
//        InputStreamReader isr = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(isr);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

//        //或者把数据写入文件
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myCode\\net.txt"));
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            bufferedWriter.write(line);
//            bufferedWriter.newLine();
//            bufferedWriter.flush();
//        }
//        bufferedWriter.close();

        serverSocket.close();
    }
}
