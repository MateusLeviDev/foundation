package org.example.CapituloIV;

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

        System.out.println("Insira três pesos diferentes [kg]");
        System.out.print("Primeira medida: ");
        double peso1 = scanner.nextDouble();
        System.out.print("Segunda medida: ");
        double peso2 = scanner.nextDouble();
        System.out.print("Terceira medida: ");
        double peso3 = scanner.nextDouble();

        double pesoMax = Math.max(peso1, (Math.max(peso2, peso3)));
        System.out.println("Mais pesado: " + pesoMax + "kg");

        scanner.close();
    }
}
