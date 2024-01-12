package com.levi.oops.concepts.java8;

public interface Payment {

    void doTransaction();

    /*
    Default methods are methods that can have a body.
    However, sometimes methods have only single implementation
    and there is no need to provide their implementation in each class.
     */
    default void addCoupon() {
        System.out.println("Add 5 R$ cashback");
    }

    /*
    common for all the implementation
    if something is common, better to keep static. rather than create a
    separate util class
     */
    static void generateTransactionReport() {
        System.out.println("Generate each transaction report");
    }
}
