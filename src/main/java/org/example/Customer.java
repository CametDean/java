package org.example;

public class Customer {
    private String name;
    private int age;
    private String drink;

    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
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
