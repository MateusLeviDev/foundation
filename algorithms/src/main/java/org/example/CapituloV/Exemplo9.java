package org.example.CapituloV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 11/23
 * book: algoritmos 29ª edição - josé augusto e jaya figueiredo
 */
public class Exemplo9 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");
        Scanner scanner = new Scanner(System.in);

        int base = 3;
        int expoente = 0;
        List<Double> potencias = new ArrayList<>();
        while (expoente<=15) {
            double potencia = Math.pow(base, expoente);
            potencias.add(potencia);
            expoente++;
        }
        for (Double potencia : potencias) {
            System.out.print(potencia);
        }


        scanner.close();
    }
}
