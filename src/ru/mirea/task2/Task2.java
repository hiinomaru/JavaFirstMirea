package ru.mirea.task2;

public class Task2 {
    public static <args> void main(String[] args) {
        System.out.println("№1");
        Shape S1 = new Shape(10, "gray");
        System.out.println(S1);
        Shape S2 = new Shape(15, "red");
        System.out.println(S2);
        System.out.println("№2");
        Ball B1 = new Ball("black", 20);
        System.out.println(B1);
        System.out.println("№3");
        Book Bo1 = new Book(1920, "1984", "J. Orwell");
        System.out.println(Bo1);
        System.out.println("№4");
        Dog D1 = new Dog(7, "Sam");
        D1.setAge(8);
        System.out.println(D1);
        System.out.println("To Human Age: " + D1.toHumanAge());
        System.out.println("№5");
        TestDog Test = new TestDog();
        Test.Dogs(4);
        System.out.println(Test);
    }
}
