package com.fan.io2;

import java.io.*;

/**
 * 复制单级目录到指定目录下
 */
public class CopyAllFilesFromDir {
    public static void main(String[] args) throws IOException {
        //创建数据源目录File对象
        File srcFolder = new File("C:\\Users\\yahfan\\Desktop\\blog");
        //获取数据源目录File对象的名称(blog)
        String srcFolderName = srcFolder.getName();  // blog

        //创建目的地目录File对象
        File desFolder = new File("myCode", srcFolderName);

        //判断目的地目录对应的File是否存在, 如果不存在, 就创建
        if(!desFolder.exists()){
            desFolder.mkdir();
        }

        //获取数据源目录下所有文件的File数组
        File[] files = srcFolder.listFiles();
        for(File srcFile:files){
            //获取数据源文件File对象的名称
            String srcFileName = srcFile.getName();
            //创建目的地文件File对象
            File destFile = new File(desFolder, srcFileName);
            copyFile(srcFile, destFile);
        }
    }

    public static void copyFile (File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0 , len);
        }

        bis.close();
        bos.close();
    }
}
