package org.example.CapituloV;

import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 11/23
 * book: algoritmos 29ª edição - josé augusto e jaya figueiredo
 */
public class Exemplo2 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");
        Scanner scanner = new Scanner(System.in);

        String resposta;
        do {
            System.out.print("Digite um valor: ");
            int value = scanner.nextInt();
            System.out.println("Resultado: " + (value * 3));

            System.out.print("Deseja continuar? (s/n): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("s"));

        scanner.close();
    }
}
