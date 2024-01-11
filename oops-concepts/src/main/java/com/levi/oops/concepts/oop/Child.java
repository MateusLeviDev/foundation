package com.levi.oops.concepts.oop;

public class Child extends Parent{

    @Override
    public void m1() {
        System.out.println("Child m1()");
    }

    public static void m2() {
        System.out.println("Child static m1()");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.m1(); //if there is no override, the method will call parent m1()
        m2(); //we cannot override static and private method
    }
}
