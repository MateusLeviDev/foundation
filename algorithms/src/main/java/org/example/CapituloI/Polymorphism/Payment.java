package org.example.CapituloI.Polymorphism;

public interface Payment {
    public void doTransaction();

    default void addCoupon() {
        System.out.println("add $5 cashback");
    }

    static void generateTransactionReport() {
        System.out.println("Generate each transaction report");
    }
}
