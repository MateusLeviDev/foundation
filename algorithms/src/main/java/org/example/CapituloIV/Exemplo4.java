package org.example.CapituloIV;

import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 11/23
 * book: algoritmos 29ª edição - josé augusto e jaya figueiredo
 */
public class Exemplo4 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        int number = scanner.nextInt();
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number);
        }

        scanner.close();
    }
}
