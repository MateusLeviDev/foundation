package org.example.CapituloV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 11/23
 * book: algoritmos 29ª edição - josé augusto e jaya figueiredo
 */
public class Exemplo8 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            if ((i%4==0) && (i < 200)) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);

        scanner.close();
    }
}
