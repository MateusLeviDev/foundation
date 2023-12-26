package org.example.CapituloI.Inheritance.Examples;

public class TestStudent {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student(
                    "S92300" + i,
                    switch (i) {
                        case 1 -> "Levi";
                        case 2 -> "Carol";
                        case 3 -> "Luiz";
                        case 4 -> "Liliane";
                        case 5 -> "Omar";
                        default -> "Anonynous";
                    },
                    "04/08/1999",
                    "Math Masterclass"
            );
            System.out.println(s);
        }
    }
}
