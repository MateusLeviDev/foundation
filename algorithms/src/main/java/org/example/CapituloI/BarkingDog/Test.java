package org.example.CapituloI.BarkingDog;

/**
 * Author: mateus levi souza
 * 12/23
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
