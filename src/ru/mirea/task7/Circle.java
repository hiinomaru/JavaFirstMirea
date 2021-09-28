package ru.mirea.task7;

public class Circle extends Shape{
    protected double radius;
    Circle(){
        radius = 10;
    }
    Circle(double r){
        radius = r;
    }
    Circle(double r, String c, boolean f){
        radius = 10;
        color = c;
        filled = f;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double r){
        radius = r;
    }
    double getArea(){
        return (radius * radius * 3.14);
    }
    double getPerimeter(){
        return (radius * 2 * 3.14);
    }
    String ToString(){
        return "The Circle, color is: " + color + "   fill: " + filled +
                "   radius: " + radius;
    }
}
