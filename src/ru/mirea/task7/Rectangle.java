package ru.mirea.task7;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    Rectangle(){
        width = 10;
        length = 10;
    }
    Rectangle(double w, double h){
        width = w;
        length = h;
    }
    Rectangle(double w, double h, String c, boolean f){
        width = w;
        length = h;
        color = c;
        filled = f;
    }
    double getWidth(){
        return width;
    }
    void setWidth(double w){
        width = w;
    }
    double getLength(){
        return length;
    }
    void setLength(double l){
        length = l;
    }
    double getArea(){
        return (width * length);
    }
    double getPerimeter(){
        return (2 * (width * length));
    }
    String ToString(){
        return "The Rectangle, color is: " + color + "   fill: " + filled +
                "   width: " + width + "   length: " + length;
    }
}
