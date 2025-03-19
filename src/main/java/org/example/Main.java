package org.example;

public class Main {
    public static void main(String[] args) {
        Customer dean = Customer.create("Dean", 20);
        Customer sam = Customer.create("Sam", 17);
        Customer castiel = Customer.create("Castiel", 100);
        Customer jack = Customer.create("Jack", 10);

        dean.isDrinking();
        sam.isDrinking();
        castiel.isDrinking();
        jack.isDrinking();
    }
}