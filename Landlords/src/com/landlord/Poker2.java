package com.landlord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 模拟斗地主的洗牌, 发牌, 看牌(升序排序)
 * 思路: 1.HashMap  键是编号, 值是牌
 * 2.ArrayList 存储编号
 * 3.创建花色数组和点数数组
 * 4.从0开始往HashMap里存储编号, 并存储对应的牌; 同时往ArrayList存编号
 * 5.洗牌(洗编号)
 * 6.发牌(发的是编号, 为了保证标号是排序的, 创建TreeSet集合接收)
 * 7.看牌(遍历TreeSet获取编号, 在HashMap找对应的牌)
 */
public class Poker2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();

        //花色
        String[] colors = {"♣", "♦", "♥", "♠"};
        //点数 按斗地主的规则从小到大
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 0;

        //花色与点数组合
        for (String number : numbers) {
            for (String color : colors) {
                map.put(index, color + number);
                array.add(index);
                index++;
            }
        }

        //大小王
        map.put(index, "JOKER-BLACK");
        array.add(index);
        index++;
        map.put(index, "JOKER-RED");
        array.add(index);

        //洗牌
        Collections.shuffle(array);

        //发牌 给三个玩家并留三张底牌
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>();  //底牌

        for (int i = 0; i < array.size(); i++) {
            int indexForPoker = array.get(i);

            //最后三张底牌
            if (i >= array.size() - 3) {
                dp.add(indexForPoker);
            } else if (i % 3 == 0) {
                player1.add(indexForPoker);
            } else if (i % 3 == 1) {
                player2.add(indexForPoker);
            } else {
                player3.add(indexForPoker);
            }
        }

        //看牌
        lookPoker("player1", player1, map);
        lookPoker("player2", player2, map);
        lookPoker("player3", player3, map);
        lookPoker("dipai", dp, map);
    }

    public static void lookPoker(String player, TreeSet<Integer> ts, HashMap<Integer, String> map) {
        System.out.print(player + "'s pokers are: ");
        for (Integer key : ts) {
            String poker = map.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
