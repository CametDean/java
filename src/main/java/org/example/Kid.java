package org.example;

public class Kid extends Customer {
    public Kid(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void isDrinking() {
        System.out.println(name + " is drinking toddy");
    }
    
}
