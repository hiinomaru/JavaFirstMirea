package ru.mirea.task5;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("№1");
        Plate P1 = new Plate("black","circle");
        System.out.println(P1);
        Bowl B1 = new Bowl("red", "rectangle");
        System.out.println(B1);
        Teapot T1 = new Teapot("amber", "round");
        T1.use();
        System.out.println(T1);
        System.out.println("№2");
        Pug Pug1 = new Pug(3, "Billy", 30, true);
        System.out.println(Pug1);
        System.out.println("Sound " + Pug1.bark());
        Pug1.setAge(5);
        System.out.println(Pug1);
        Mastiff Mas1 = new Mastiff(10, "Carlos", 90, false);
        System.out.println(Mas1);
        System.out.println("Sound " + Mas1.bark());
        Mas1.setOverweight(true);
        Mas1.setTall(100);
        System.out.println(Mas1);
        System.out.println("№3");
        Table Tab1  = new Table(180, 90, "white", 5000, 80);
        System.out.println(Tab1);
        System.out.println("Surface area: " + Tab1.getSurfaceArea());
        Dresser D1 = new Dresser(140, 60, "venge", 3500, 210);
        System.out.println(D1);
        System.out.println("Volume: " + D1.getVolume() + " l.");
        Chair Chair1 = new Chair(60, 60, "pale wood", 4000, false);
        System.out.println(Chair1);
    }
}
