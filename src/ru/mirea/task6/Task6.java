package ru.mirea.task6;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("№1 Nameable");
        Animal A = new Animal(5,"python", "Gera");
        System.out.println(A.getName());
        A.setName("Rogoz");
        System.out.println(A);
        Planet P = new Planet(6400, 32163, "Pluto");
        System.out.println(P.getName());
        P.setName("Neptune");
        System.out.println(P);
        System.out.println("№2 Priceable:");
        Phone Ph = new Phone(17500,"Z3", "Xiaomi");
        System.out.println(Ph.getPrice());
        Ph.setPrice(20000);
        System.out.println(Ph);
        Flat F = new Flat(3200, 100, "Leninskiy");
        System.out.println(F.getPrice());
        F.setPrice(4100);
        System.out.println(F);

    }
}
