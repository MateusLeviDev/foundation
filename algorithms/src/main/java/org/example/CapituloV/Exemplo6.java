package org.example.CapituloV;

import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 11/23
 * book: algoritmos 29ª edição - josé augusto e jaya figueiredo
 */
public class Exemplo6 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i <= 500; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        scanner.close();
    }
}
