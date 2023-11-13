package br.com.levi;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class ArraysCompareTest {
    @Test
    void test() {
        int[] numbers = {1, 4, 2, 3, 8, 5, 6, 12, 10, 20};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 8, 10, 12, 20};

        Arrays.sort(numbers);

        assertArrayEquals(numbers, expectedArray);
    }
}
