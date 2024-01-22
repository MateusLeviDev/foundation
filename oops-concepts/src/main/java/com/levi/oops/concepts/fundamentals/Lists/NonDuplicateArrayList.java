package com.levi.oops.concepts.fundamentals.Lists;

import com.levi.oops.concepts.oop.Student;

import java.util.ArrayList;
import java.util.HashSet;

public class NonDuplicateArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return true;
        } else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {
        NonDuplicateArrayList nonDuplicateArrayList = new NonDuplicateArrayList();
        nonDuplicateArrayList.add(1);
        nonDuplicateArrayList.add(1);
        nonDuplicateArrayList.add(2);

        System.out.println(nonDuplicateArrayList);

        System.out.println("=============================================");

        HashSet<Student> students = new HashSet<>();
        Student s1 = new Student(101L, "Levi");
        Student s2 = new Student(101L, "Levi");
        Student s3 = new Student(105L, "Souza");

        students.add(s1);
        students.add(s2);
        students.add(s3);

        students.forEach(System.out::println);
    }
}
