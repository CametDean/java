package org.example;

public class Main {
    public static void main(String[] args) {
        YoungAdult dean = new YoungAdult("Dean", 20);
        Teen sam = new Teen("Sam", 17);
        Adult castiel = new Adult("Castiel", 100);
        Kid jack = new Kid("Jack", 10);
        
        Bartender bartender = new Bartender();
        
        bartender.serveDrink(dean);
        dean.isDrinking();
        
        bartender.serveDrink(sam);
        sam.isDrinking();
        
        bartender.serveDrink(castiel);
        castiel.isDrinking();
        
        bartender.serveDrink(jack);
        jack.isDrinking();
    }
}