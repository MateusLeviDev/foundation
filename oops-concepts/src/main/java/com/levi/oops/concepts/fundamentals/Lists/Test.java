package com.levi.oops.concepts.fundamentals.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 4, 3, 2, 6, 7, 8);

        numbers.forEach(System.out::println);

        System.out.println("---------------------------------------");

        LinkedList<String> linkedList = new LinkedList<>(List.of(
                "Levi", "Levi", "Mateus", "Lucas", "Fezao", "Omar", "Naruto"));

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println("Integers: " + integers);

        System.out.println("List: " + linkedList.get(1).concat(" Souza").strip().length());

        ArrayList<String> str = new ArrayList<>();

    }
}
