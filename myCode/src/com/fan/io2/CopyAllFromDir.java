package com.fan.io2;

import java.io.*;

/**
 * 复制多级文件夹
 *
 */
public class CopyAllFromDir {
    public static void main(String[] args) throws IOException{
        //创建数据源目录File对象
        File srcFile = new File("C:\\Users\\yahfan\\Desktop\\blog");
        //创建目的地File对象
        File destFile = new File("myCode");

        copyFolder(srcFile, destFile);

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

    public static void copyFolder (File srcFile, File destFile) throws IOException {
        //判断数据源File是否是目录
        if(srcFile.isDirectory()) {
            //在目的地下创建和数据源File名称一样的目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);

            if(!newFolder.exists()){
                newFolder.mkdir();
            }

            //获取数据源File下所有文件或者目录的File数组
            File[] listFiles = srcFile.listFiles();
            for(File file: listFiles){
                copyFolder(file, newFolder);
            }
        } else {
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }
}
