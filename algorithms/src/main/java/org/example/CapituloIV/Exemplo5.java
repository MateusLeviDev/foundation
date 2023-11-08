package org.example.CapituloIV;

import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 11/23
 * book: algoritmos 29ª edição - josé augusto e jaya figueiredo
 */
public class Exemplo5 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Número inteiro: ");
        int x = scanner.nextInt();

        for (int i : new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}) {
            System.out.println(x + " X " + i + " = " + (x * i));
        }

       //no lop se i ñ pode ser == 10. pq ele deve ser true ao menos uma vez. iteration

        scanner.close();
    }
}
