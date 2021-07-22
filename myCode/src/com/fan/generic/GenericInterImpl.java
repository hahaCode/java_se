package com.fan.generic;

public class GenericInterImpl<T> implements GenericInter<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
