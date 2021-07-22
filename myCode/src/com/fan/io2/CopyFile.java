package com.fan.io2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileReader: 用于读取字符文件的便捷类
 * FileWriter: 用于写入字符文件的便捷类
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符输入流对象
        FileReader fr = new FileReader("myCode\\osw.txt");
        //根据目的地创建字符输出流对象
        FileWriter fw = new FileWriter("myCode\\osw-copy.txt");

        //读写数据, 复制文件
//        int ch;
//        while ((ch = fr.read()) != -1) {
//            fw.write(ch);
//        }

        char[] chars = new char[1024];
        int len;
        while ((len = fr.read(chars)) != -1) {
            fw.write(chars, 0, len);
        }

        //释放资源
        fr.close();
        fw.close();
    }

    //加入异常处理的代码
    public static void function1() {

        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("myCode\\osw.txt");
            fw = new FileWriter("myCode\\osw-copy.txt");

            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //加入异常处理的代码 JDK7改进方案

    /** JDK7改进方案
     * try(定义流对象){
     *     可能出现异常的代码
     * }catch(异常类名 变量名){
     *     异常的处理代码
     * }
     *    不需要finally 自动释放资源
     */


    public static void function2() {

        try (FileReader fr = new FileReader("myCode\\osw.txt");
             FileWriter fw = new FileWriter("myCode\\osw-copy.txt");) {

            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** JDK9改进方案
     *
     * 定义输入流对象;
     * 定义输出流对象;
     *
     * try(输入流对象; 输出流对象){
     *     可能出现异常的代码
     * }catch(异常类名 变量名){
     *     异常的处理代码
     * }
     *    不需要finally 自动释放资源
     */

    public static void function3() throws IOException{

        FileReader fr = new FileReader("myCode\\osw.txt");
        FileWriter fw = new FileWriter("myCode\\osw-copy.txt");

        try (fr;fw) {

            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
