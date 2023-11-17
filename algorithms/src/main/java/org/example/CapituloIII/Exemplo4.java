package org.example.CapituloIII;

import java.util.stream.Stream;

/**
 * Author: mateus levi souza
 * 11/23
 * book: grokking algorithms
 */
public class Exemplo4 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("==== iniciando programa ====");
        System.out.println("=============================");
        int n = 10;
        System.out.println("Sequência de Fibonacci até " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

//    public static Stream<Integer> fibonacciSequence(int n) {
//        return Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
//                .limit(n)
//                .map(fib -> fib[0]);
//    }

    public static int fibonacci(int i) {
        if (i <= 0) return i;
        else return fibonacci(i - 1) + fibonacci(i + 2);
    }
}
