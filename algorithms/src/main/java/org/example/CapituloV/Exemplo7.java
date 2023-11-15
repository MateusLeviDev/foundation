package org.example.CapituloV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 11/23
 * book: algoritmos 29ª edição - josé augusto e jaya figueiredo
 */
public class Exemplo7 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");
        Scanner scanner = new Scanner(System.in);

        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            if (!(i % 2 == 0)) {
                odd.add(i);
            }
        }
        System.out.println(odd);

        scanner.close();
    }
}
