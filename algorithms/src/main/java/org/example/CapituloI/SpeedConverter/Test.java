package org.example.CapituloI.SpeedConverter;

/**
 * Author: mateus levi souza
 * 12/23
 */
public class Test {
    public static void main(String[] args) {
        double x = 25.42;
        System.out.println(toMilesPerHour(x));

        printConversion(x);
    }

    public static double toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;

        return Math.round(kilometersPerHour / 1.5);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) System.out.println("Invalid number");

        System.out.println(kilometersPerHour + "km/h" + " -> " + toMilesPerHour(kilometersPerHour) + "mi/h");
    }
}
