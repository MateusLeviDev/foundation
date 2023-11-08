package org.example.CapituloIV;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");

        Scanner scanner = new Scanner(System.in);
        double result;

        System.out.print("Escolha um número: ");
        double number = scanner.nextDouble();
        if (!(number < 0)) {
            if (number != 5) {
                result = Math.pow(number, 2);
                System.out.println(result);
            } else {
                result = Math.pow(number, 3);
                System.out.println(result);
            }
        }

        scanner.close();
    }
}
