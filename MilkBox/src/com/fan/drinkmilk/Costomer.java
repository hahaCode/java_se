package com.fan.drinkmilk;

public class Costomer implements Runnable{

    private Box box;

    public Costomer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            box.get();
        }
    }
}
