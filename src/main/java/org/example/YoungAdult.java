package org.example;

public class YoungAdult extends Customer {
    public YoungAdult(String name, int age) {
        super(name, age);
    }

    @Override
    public void isDrinking() {
        System.out.println(name + " is drinking beer");
    }
}
