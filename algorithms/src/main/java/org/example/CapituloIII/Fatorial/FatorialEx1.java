package org.example.CapituloIII.Fatorial;

import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 11/23
 * book: algoritmos 29ª edição - josé augusto e jaya figueiredo
 */
public class FatorialEx1 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");
        Scanner scanner = new Scanner(System.in);

        int n = 5;
        System.out.println(fatorial(n));

        scanner.close();
    }
    public static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }


}
