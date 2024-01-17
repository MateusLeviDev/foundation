package com.levi.oops.concepts.fundamentals;

public class TestImmutableString {

    public static void main(String[] args) {
        String s = "Bob";
        s.concat(" Marley");
        System.out.println(s); //will print bob 'cause strings are immutable

        StringBuffer sb = new StringBuffer("Bob ");
        sb.append("Marley");
        System.out.println(sb); //can be repalced with sout("Bob" + "Marley");
    }
}
