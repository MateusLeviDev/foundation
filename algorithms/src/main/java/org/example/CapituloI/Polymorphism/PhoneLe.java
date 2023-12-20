package org.example.CapituloI.Polymorphism;

public class PhoneLe implements Payment{
    @Override
    public void doTransaction() {
        System.out.println("PhoneLe transaction");
    }
}
