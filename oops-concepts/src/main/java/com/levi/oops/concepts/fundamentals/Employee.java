package com.levi.oops.concepts.fundamentals;

import java.util.HashSet;
import java.util.Objects;

public class Employee {

    private String name;
    private Integer id;

    public Employee(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Levi", 8);
        Employee employee2 = new Employee("Levi", 8);

        System.out.println("Is hashcode same: " + (employee1.hashCode() == employee2.hashCode()));
        System.out.println("Is equals same: " + employee1.equals(employee2));

        HashSet<Employee> employees = new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);

        System.out.println(employees);
    }
}
