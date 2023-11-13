package org.example.CapituloV;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 11/23
 * book: algoritmos 29ª edição - josé augusto e jaya figueiredo
 */
public class Exemplo3 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");
        Scanner scanner = new Scanner(System.in);

        for (int i = 15; i <= 200; i++) {
            double pow = Math.pow(i,2);
            System.out.println(i + "² = " + pow);
        }

        scanner.close();
    }
}
