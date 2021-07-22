package com.fan.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo_04 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("value1-1");
        arrayList1.add("value1-2");
        arrayList1.add("value1-3");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("value2-1");
        arrayList2.add("value2-2");
        arrayList2.add("value2-3");

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("value3-1");
        arrayList3.add("value3-2");
        arrayList3.add("value3-3");

        map.put("key1", arrayList1);
        map.put("key2", arrayList2);
        map.put("key3", arrayList3);

        System.out.println(map);
        System.out.println("--------------");

        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            System.out.println(key);
            ArrayList<String> value = entry.getValue();
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }
}
