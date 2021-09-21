package ru.mirea.task3;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("№1");
        Circle C1 = new Circle(10, "red");
        System.out.println(C1);
        C1.setColor("green");
        C1.setRadius(12);
        System.out.println(C1);
        System.out.println(C1.getPerimeter());
        System.out.println("№2");
        Human H = new Human(180);
        System.out.println(H);
        H.setTall(190);
        H.H.setHead_size('L');
        System.out.println(H);
        H.H1.setFinger_size(19);
        System.out.println("Left hand: " + H.H1.getFinger_size() + "    right hand: " + H.H2.getFinger_size());
        System.out.println("№3");
        Book B1 = new Book(1949, "1984", "J. Orwell");
        System.out.println(B1);
        B1.setyear(2000);
        B1.setname("History of modern society");
        System.out.println(B1);
        System.out.println(B1.getauthor() + "  " + B1.getname());

    }
}
