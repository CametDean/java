package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    
    Bartender bartender = new Bartender();
    
    @Test
    public void shouldServeToddy() {
        Kid customer = new Kid("Claire", 12);
        
        bartender.serveDrink(customer);
        
        String expectedDrink = "toddy";
        
        assertEquals(expectedDrink, customer.getDrink());
    }

    @Test
    public void shouldServeCoke() {
        Teen customer = new Teen("Claire", 16);

        bartender.serveDrink(customer);

        String expectedDrink = "coke";

        assertEquals(expectedDrink, customer.getDrink());
    }

    @Test
    public void shouldServeBeer() {
        YoungAdult customer = new YoungAdult("Claire", 20);
        
        bartender.serveDrink(customer);

        String expectedDrink = "beer";

        assertEquals(expectedDrink, customer.getDrink());
    }

    @Test
    public void shouldServeWhisky() {
        Adult customer = new Adult("Claire", 50);

        bartender.serveDrink(customer);

        String expectedDrink = "whisky";

        assertEquals(expectedDrink, customer.getDrink());
    }
}