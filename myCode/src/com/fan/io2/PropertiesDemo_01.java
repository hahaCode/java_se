package com.fan.io2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties 和 IO 流结合
 *   load : 从输入字符流/字节流读取属性列表 (键和值)
 *   store: 将属性列表写入Properties表中
 */
public class PropertiesDemo_01 {
    public static void main(String[] args) throws IOException {
        myStore();
        myLoad();
    }

    //把文件中的数据加载到集合
    private static void myLoad() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("myCode\\prop.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);

    }

    //把集合中的数据保存到文件
    private static void myStore ()  throws IOException {
        Properties prop = new Properties();

        prop.setProperty("ip", "127.0.0.1");
        prop.setProperty("time", "30ms");

        FileWriter fw = new FileWriter("myCode\\prop.txt");
        prop.store(fw, null);
        fw.close();
    }
}
