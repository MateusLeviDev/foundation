package org.example.CapituloI.Inheritance.Examples;

public class Main {
    public static void main(String[] args) {

        Customer nobodyAccount = new Customer("Tim", 1000, "tim@email.com");
        System.out.println(nobodyAccount.getName());
        System.out.println(nobodyAccount.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getEmail());
        System.out.println(secondCustomer.getCreditLimit());

        //*___________________________________________________________*

        House newHouse = new House("blue");
        House anotherHouse = newHouse;

        System.out.println(newHouse.getColor());
        System.out.println(anotherHouse.getColor());

        anotherHouse.setColor("Green");

        System.out.println(anotherHouse.getColor());
        System.out.println(newHouse.getColor());

        House pinkHouse = new House("pink");
        anotherHouse = pinkHouse;

        System.out.println(anotherHouse.getColor()); //pink
        System.out.println(newHouse.getColor()); //green
        System.out.println(pinkHouse.getColor()); //pink

    }
}
