package org.example.CapituloIII;

import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 11/23
 * book: grokking algorithms
 */
public class Exemplo2 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");

        countdown(10);
    }

    public static int sum(int x) {
        return sum(x + 1);
    }

    public static void countdown(int i) {
        System.out.println(i);
        if (i <= 0) {
            return;
        } else {
            countdown(i - 1);
        }
    }
}
