package org.example;

public class Adult extends Customer {
    public Adult(String name, int age) {
        super(name, age);
    }

    @Override
    public void isDrinking() {
        System.out.println(name + " is drinking whisky");
    }
}
