package com.fan.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapDemo_03 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");

        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("黄晓明", "AB");
        hm3.put("胡歌", "单身");

        arrayList.add(hm1);
        arrayList.add(hm2);
        arrayList.add(hm3);

        for(HashMap<String, String> hm : arrayList){
            Set<String> keySet = hm.keySet();
            for(String key : keySet){
                System.out.println(key + " " + hm.get(key));
            }
        }
    }
}
