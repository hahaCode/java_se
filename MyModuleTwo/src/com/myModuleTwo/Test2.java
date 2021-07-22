package com.myModuleTwo;

import com.myServices.MyService;

import java.util.ServiceLoader;

public class Test2 {
    public static void main(String[] args) {
        //加载服务
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);

        for(MyService my:myServices){
            my.service();
        }
    }
}
