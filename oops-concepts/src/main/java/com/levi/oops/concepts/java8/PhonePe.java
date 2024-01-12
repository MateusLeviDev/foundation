package com.levi.oops.concepts.java8;

public class PhonePe implements Payment{

    @Override
    public void doTransaction() {
        System.out.println("PhonePe transaction");
    }

    @Override
    public void addCoupon() {
        System.out.println("Add R$ 4 cashback");
    }

    public static void main(String[] args) {
        Payment.generateTransactionReport();
    }
}
