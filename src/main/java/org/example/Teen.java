package org.example;

public class Teen extends Customer{
    public Teen(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void isDrinking() {
        System.out.println(name + " is drinking coke");
    }
}
