package org.example.CapituloI.CheckNumber;

import org.example.CapituloI.CheckNumber.NumberType;

import java.util.Scanner;

/**
 * Author: mateus levi souza
 * 12/23
 */
public class MainTest {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(checkNumber(x).getLabel());
    }

    public static NumberType checkNumber(int x) {
        return (x < 0) ? NumberType.NEGATIVE : (x > 0) ? NumberType.POSITIVE : NumberType.ZERO;
    }
}
