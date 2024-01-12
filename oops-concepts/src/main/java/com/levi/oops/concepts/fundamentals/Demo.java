package com.levi.oops.concepts.fundamentals;

public class Demo {

    private final int a = 10;

    public void m1() {
        try {
            System.out.println("Try block");
        } finally {
            System.out.println("Finally block");
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.m1();
        demo = null;
        System.gc();
    }
}
