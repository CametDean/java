package org.example;

public class Bartender {
    public void serveDrink(Customer customer) {
        if (customer.getAge() < 14) {
            customer.setDrink("toddy");
        } else if (customer.getAge() > 14 && customer.getAge() < 18) {
            customer.setDrink("coke");
        } else if (customer.getAge() > 18 && customer.getAge() < 21) {
            customer.setDrink("beer");
        } else {
            customer.setDrink("whisky");
        }
    }
}
