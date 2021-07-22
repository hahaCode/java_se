package com.fan.network2;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {

    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try{
            //接收数据写到文件
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //名称固定有问题
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myCode\\copy-net.txt"));

            int count = 0;
            File f = new File("myCode\\copy-net-"+count+".txt");

            while (f.exists()) {
                count++;
                f = new File("myCode\\copy-net-"+count+".txt");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

            //给出反馈
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("文件上传成功!");
            bw.newLine();
            bw.flush();

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
