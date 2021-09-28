package ru.mirea.task7;

public class Square extends Rectangle {
    Square(){
        width = 10;
        length = 10;
    }
    Square(double side){
        width = side;
        length = side;
    }
    Square(double side, String c, boolean f){
        width = side;
        length = side;
        color = c;
        filled = f;
    }
    double getSide(){
        return width;
    }
    void setSide(double side){
        width = side;
        length = side;
    }
    String ToString(){
        return "The Squad, color is: " + color + "   fill: " + filled +
                "   side: " + width;
    }
}
