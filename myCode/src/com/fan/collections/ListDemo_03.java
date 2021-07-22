package com.fan.collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * List 的常用子类 ArrayList  LinkedList
 */

public class ListDemo_03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hehe");
        arrayList.add("xixi");
        arrayList.add("haha");

        for(String s :arrayList){
            System.out.println(s);
        }
        System.out.println("-----------------");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");

        linkedList.addFirst("zero");
        linkedList.addLast("last");

        for(String s :linkedList){
            System.out.println(s);
        }
        System.out.println("-----------------");
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
    }
}
