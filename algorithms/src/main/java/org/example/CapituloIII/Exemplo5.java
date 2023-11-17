package org.example.CapituloIII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: mateus levi souza
 * 11/23
 * book: grokking algorithms
 */
public class Exemplo5 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");

        List<Integer> list = new ArrayList<>(List.of(3, 1, 4, 8, 2, 6));
        list.stream().sorted().forEach(System.out::println);

    }
}
