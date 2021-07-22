package com.fan.io2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * 文件里存储了班级同学的姓名, 每个名字占一行, 实现随机点名
 *
 */
public class RollCall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myCode\\names.txt"));
        ArrayList<String> arrayList = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            arrayList.add(line);
        }
        br.close();

        Random random = new Random();
        int index = random.nextInt(arrayList.size());//产生一个随机数 [0,  集合长度)
        System.out.println(arrayList.get(index));
    }
}
