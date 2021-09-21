package ru.mirea.task4;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("№1");
        Author a1 = new Author("Carl Gustav Jung",
                "jung_psychology@gmail.com",
                'm');
        System.out.println(a1);
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        a1.setEmail("carl_jung@mail.ru");
        System.out.println("changed E-mail: " + a1.getEmail());
        System.out.println(a1);
        System.out.println("№2");
        Ball B1 = new Ball(10, 20.5);
        System.out.println(B1);
        B1.setY(15);
        System.out.println(B1);
        B1.move(-5, -10);
        System.out.println("( x-5, y-10 )new position: " + B1);
    }
}
