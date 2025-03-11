package org.example;

public class Main {
    public static void main(String[] args) {
        Customer dean = new Customer();
        dean.setName("dean");
        dean.setAge(20);
        
        Customer sam = new Customer();
        sam.setName("sam");
        sam.setAge(17);
        
        Customer castiel = new Customer();
        castiel.setName("castiel");
        castiel.setAge(100);
        
        Customer jack = new Customer();
        jack.setName("jack");
        jack.setAge(10);
        
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