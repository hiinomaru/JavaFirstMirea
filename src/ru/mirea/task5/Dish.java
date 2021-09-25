package ru.mirea.task5;

public abstract class Dish {
    boolean isClean = true;
    String color;
    String shape;
    void wash(){
        isClean = true;
    }
    boolean get_isClean(){
        return isClean;
    }
    void setcolor(String c){
        color = c;
    }
    public abstract void use();
    public abstract String toString();
}
