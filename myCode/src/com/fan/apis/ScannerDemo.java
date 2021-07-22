package com.fan.apis;

import java.util.Scanner;

/**
 * Scanner 用于获取键盘录入的数据. （基本数据类型, 字符串数据）
 *
 * public String nextLine() 获取键盘录入字符串数据
 */

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input A String:");
        String line = sc.nextLine();
        // 调用方法的时候, 如果方法有明确的返回值, 我们用变量接收, 可以手动完成, 也可以使用快捷键 Ctrl + Alt + V

        System.out.println("You have input:" + line);
    }
}
