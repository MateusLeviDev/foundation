package com.levi.oops.concepts.java8;

public class GooglePay implements Payment {

    @Override
    public void doTransaction() {
        System.out.println("GooglePay transaction");
    }

    @Override
    public void addCoupon() {
        //Payment.super.addCoupon();
        System.out.println("Add R$ 10 cashback");
    }

    public static void main(String[] args) {
        Payment payment = new GooglePay();
        payment.addCoupon();
    }
}
