package com.fan.myExceptions;

public class CustomerExceptionDemo {

    public void checkNumber(int num) throws CustomerException {
        if(num > 100 || num < 0) {
            throw new CustomerException("Invalid NUmber!");
        } else {
            System.out.println("Legal Input!");
        }
    }

}
