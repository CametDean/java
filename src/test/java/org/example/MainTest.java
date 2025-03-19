package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    
    @Test
    public void shouldServeToddy() {
        Customer claire = Customer.create("Claire", 12);
        
        String expectedDrink = "toddy";
        
        assertEquals(expectedDrink, claire.drink);
    }

    @Test
    public void shouldServeCoke() {
        Customer claire = Customer.create("Claire", 16);
        
        String expectedDrink = "coke";

        assertEquals(expectedDrink, claire.drink);
    }

    @Test
    public void shouldServeBeer() {
        Customer claire = Customer.create("Claire", 20);
        
        String expectedDrink = "beer";

        assertEquals(expectedDrink, claire.drink);
    }

    @Test
    public void shouldServeWhisky() {
        Customer claire = Customer.create("Claire", 50);
        
        String expectedDrink = "whisky";

        assertEquals(expectedDrink, claire.drink);
    }
}