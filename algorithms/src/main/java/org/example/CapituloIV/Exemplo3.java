package org.example.CapituloIV;

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

        System.out.println("Insira três lados do triângulo [cm]");
        System.out.print("Primeira medida: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Segunda medida: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Terceira medida: ");
        double lado3 = scanner.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2 ) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else System.out.println("Deu ruim!");
    }
}
