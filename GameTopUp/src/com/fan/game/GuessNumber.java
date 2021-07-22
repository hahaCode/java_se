package com.fan.game;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字的游戏, 只能试玩3次, 试玩结束后要求充值才能继续玩
 *
 */
public class GuessNumber {

    public GuessNumber() {
    }

    public static void start(){
        //随机生成一个被猜数字, 范围1 ~ 100
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        //猜数字
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你猜测的结果:");
            int guessNum = scanner.nextInt();

            if(guessNum > number) {
                System.out.println("你的猜测结果:" + guessNum + "比正确结果大!");
            } else if (guessNum < number) {
                System.out.println("你的猜测结果:" + guessNum + "比正确结果小!");
            } else {
                System.out.println("恭喜你猜对了!");
                break;
            }
        }
    }
}
