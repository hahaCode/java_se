package com.fan.io1;

import java.io.File;
import java.io.IOException;

public class FileDemo_01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\yahfan\\Desktop\\blog\\java.txt");
        //System.out.println(f1.createNewFile()); //创建文件, 如果文件不存在就创建并返回true, 如果文件存在就不创建且返回false

        //File f2 = new File("C:\\Users\\yahfan\\Desktop\\blog\\javaSE");
        //System.out.println(f2.mkdir());//创建目录

        //File f3 = new File("C:\\Users\\yahfan\\Desktop\\blog\\javaSE\\test");
        //System.out.println(f3.mkdirs());//创建多级目录

        getAllFilePath(f1);
    }

    public static void getAllFilePath(File file) {
        //获取给定目录下的所有文件或者目录的File数组
        File[] fileArray = file.listFiles();
        if(fileArray != null) {
            for(File f:fileArray){
                //如果是目录就递归调用
                if(f.isDirectory()){
                    getAllFilePath(f);
                } else {
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
