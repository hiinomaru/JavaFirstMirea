package ru.mirea.task5;

public class Plate extends Dish {
    Plate(String c, String s){
        color = c;
        shape = s;
    }

    @Override
    public String toString() {
        return "This is Plate{" +
                "isClean=" + isClean +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }

    public void use() {
        isClean = false;
    }
}
