package com.fan.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo_02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k001", "Amy");
        map.put("k002", "Alen");
        map.put("k003", "Tom");

        System.out.println(map.get("k001"));

        System.out.println("---------------");
        //根据键找值
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " " +map.get(key));
        }

        System.out.println("---------------");
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("---------------");
        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " +value);
        }
    }
}
