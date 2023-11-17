package org.example.CapituloIII;

/**
 * Author: mateus levi souza
 * 11/23
 * book: grokking algorithms
 */
public class Exemplo3 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");
        System.out.println();
        greet("Levi");
    }

    public static void greet(String name) {
        System.out.println("- Hello, " + name + "!");
        greet2(name);
        bye();
    }

    public static void greet2(String name) {
        System.out.println("- How are you, " + name + "?");
    }

    public static void bye() {
        System.out.println("- ok bye");
    }
}
