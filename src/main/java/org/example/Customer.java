package org.example;

public class Customer {
    final private String name;
    final private int age;
    private String drink;
    
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
