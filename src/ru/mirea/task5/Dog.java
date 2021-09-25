package ru.mirea.task5;

public abstract class Dog {
    private int age;
    private String name;
    private int tall;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }
    public abstract String bark();
}
