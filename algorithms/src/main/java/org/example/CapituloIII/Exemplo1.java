package org.example.CapituloIII;

import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 11/23
 * book: grokking algorithms
 */
public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");

        Scanner scanner = new Scanner(System.in);

        System.out.println(fact(4));

        scanner.close();
    }

    public static int fact(int x) {
        if (x == 1) return 1;
        else return x * fact(x - 1);
    }
}
