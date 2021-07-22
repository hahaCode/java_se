package com.fan.apis;

import java.util.Scanner;

public class StringBuilderDemo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string:");
        String s = scanner.nextLine();

        StringBuilder sb = new StringBuilder(s);
        String res = sb.reverse().toString();
        System.out.println(res);
    }
}