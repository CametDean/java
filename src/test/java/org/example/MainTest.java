package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    
    Bartender bartender = new Bartender();
    
    @Test
    public void shouldServeToddy() {
        Customer customer = new Customer();
        customer.setAge(12);
        
        bartender.serveDrink(customer);
        
        String expectedDrink = "toddy";
        
        assertEquals(expectedDrink, customer.getDrink());
    }

    @Test
    public void shouldServeCoke() {
        Customer customer = new Customer();
        customer.setAge(16);

        bartender.serveDrink(customer);

        String expectedDrink = "coke";

        assertEquals(expectedDrink, customer.getDrink());
    }

    @Test
    public void shouldServeBeer() {
        Customer customer = new Customer();
        customer.setAge(20);

        bartender.serveDrink(customer);

        String expectedDrink = "beer";

        assertEquals(expectedDrink, customer.getDrink());
    }

    @Test
    public void shouldServeWhisky() {
        Customer customer = new Customer();
        customer.setAge(50);

        bartender.serveDrink(customer);

        String expectedDrink = "whisky";

        assertEquals(expectedDrink, customer.getDrink());
    }
}