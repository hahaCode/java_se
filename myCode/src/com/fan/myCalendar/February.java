package com.fan.myCalendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 获取任意一年的二月有多少天
 * 思路: 1。设置日历对象的年, 月, 日
 * 2. 年来自键盘输入; 月设置为3月, 由于月是从0开始的, 所以设置值为2; 日设置为1日
 * 3. 3月1日往前推一天, 就是二月的最后一天
 * 4. 获取并输出这一天
 */

public class February {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a year: ");
        int year = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, 2, 1);
        calendar.add(Calendar.DATE, -1);

        System.out.println("The February Days of year " + year + " is " + calendar.get(Calendar.DATE) + ".");
    }
}
