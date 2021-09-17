package ru.mirea.task2;

public class Shape{
    private int size;
    private String color;
    Shape(int s, String c){
        size = s;
        color = c;
    }
    public String toString(){
        return "This is Shape, color: " + color + "   size: " + size;
    }
}
