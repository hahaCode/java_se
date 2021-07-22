package com.fan.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo_01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k001","Amy");
        map.put("k002","Alen");
        map.put("k003","Tom");

        System.out.println(map.remove("k001"));
        System.out.println(map.remove("k005"));

        //map.clear();
        System.out.println(map.containsKey("k002"));
        System.out.println(map.containsValue("Alen"));

        map.clear();
        System.out.println(map.isEmpty());
    }
}
