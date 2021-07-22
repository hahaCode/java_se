package com.landlord;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 模拟斗地主的洗牌, 发牌, 看牌(没有排序)
 */
public class Poker {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        //扑克牌
        // ♣ ♦ ♥ ♠ 大小王

        //花色
        String[] colors = {"♣", "♦", "♥", "♠"};
        //点数
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //花色与点数组合
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }

        //大小王
        array.add("JOKER-BLACK");
        array.add("JOKER-RED");

        //System.out.println(array);

        //洗牌
        Collections.shuffle(array);

        //发牌 给三个玩家并留三张底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();  //底牌

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);

            //最后三张底牌
            if (i >= array.size() - 3) {
                dp.add(poker);
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }

        //看牌
        lookPoker(player1, "player1");
        lookPoker(player2, "player2");
        lookPoker(player3, "player3");
        lookPoker(dp, "dipai");
    }

    public static void lookPoker(ArrayList<String> array, String player) {
        System.out.print(player + "'s pokers are: ");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
