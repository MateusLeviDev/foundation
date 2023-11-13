package br.com.levi.Math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {1,4,2,3,8,5,6,12,10,20};
        IntStream sorted = Arrays.stream(numbers).sorted();
        System.out.println(Arrays.toString(sorted.toArray()));
    }
}
