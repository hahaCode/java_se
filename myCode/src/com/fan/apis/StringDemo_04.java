package com.fan.apis;

import java.util.Scanner;

public class StringDemo_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input A String：");
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {

        String ss = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }
}
