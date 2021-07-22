package com.fan.game;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PlayGame {
    public static void main(String[] args) throws IOException {

        //从文件中读取数据到Properties集合
        Properties properties = new Properties();
        FileReader fr = new FileReader("GameTopUp\\game.txt");
        properties.load(fr);
        fr.close();

        String count = (String) properties.get("count");
        int n = Integer.parseInt(count);
        if(n >= 3) {
            System.out.println("试玩结束, 如果想继续玩, 请充值(www.fan.com.game)");
        } else{
            GuessNumber.start();

            //试玩次数加1, 重新写回文件
            n++;
            properties.setProperty("count", String.valueOf(n));
            FileWriter fw = new FileWriter("GameTopUp\\game.txt");
            properties.store(fw, null);
            fw.close();
        }
    }
}
