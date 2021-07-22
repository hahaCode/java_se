package com.fan.collections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapDemo_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input a String:");
        String s = scanner.nextLine();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            Integer value = hashMap.get(key);
            if (value == null) {
                hashMap.put(key, 1);
            } else {
                value++;
                hashMap.put(key, value);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> keySet = hashMap.keySet();
        for(Character key: keySet) {
            Integer integer = hashMap.get(key);
            stringBuilder.append(key).append("(").append(integer).append(")");
        }

        System.out.println(stringBuilder.toString());
    }
}
