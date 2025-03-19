package org.example;

public class Customer {
    public final String name;
    public final int age;
    protected String drink;
    
    public Customer(String name, int age) {
        this.name = name;  
        this.age = age;
    }
    
    public String getDrink() {
        return drink;
    }
    
    public void isDrinking() {
        System.out.println(name + " is drinking " + drink); 
    }
    
    public static Customer create(String name, int age) {
        if (age < 14) {
            return new Kid(name, age);
        } else if (age > 14 && age < 18) {
           return new Teen(name, age);
        } else if (age > 18 && age < 21) {
            return new YoungAdult(name, age);
        } else {
           return new Adult(name, age);
        }
    }
}