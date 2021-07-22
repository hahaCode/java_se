package com.fan.overwrite;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call("Alvin");

        System.out.println("-----------------------");
        NewPhone newPhone = new NewPhone();
        newPhone.call("Alvin");
    }
}
