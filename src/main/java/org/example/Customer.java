package org.example;

public class Customer {
    public final String name;
    public final int age;
    public String drink;
    
    public Customer(String name, int age) {
        this.name = name;  
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void isDrinking() {
        System.out.println(name + " is drinking " + drink); 
    }
}
