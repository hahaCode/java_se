package com.fan.sets;

import java.util.ArrayList;

public class ArrayListDemo_02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
