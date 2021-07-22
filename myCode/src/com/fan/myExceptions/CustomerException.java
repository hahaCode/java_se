package com.fan.myExceptions;

/**
 * 自定义异常
 */
public class CustomerException extends Exception{

    public CustomerException(){}
    public CustomerException(String message){
        super(message);
    }
}
