package ru.mirea.task7;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    Shape(){
        color = "blue";
        filled = true;
    }
    Shape(String c, boolean f){
        color = c;
        filled =f;
    }
    String getColor(){
        return color;
    }
    void setColor(String c){
        color = c;
    }
    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean f){
        filled = f;
    }
    abstract double getArea();
    abstract double getPerimeter();
    abstract String ToString();
}
