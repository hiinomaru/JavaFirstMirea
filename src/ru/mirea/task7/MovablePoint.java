package ru.mirea.task7;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int X, int Y, int XSpeed, int YSpeed){
        x = X;
        y = Y;
        xSpeed = XSpeed;
        ySpeed = YSpeed;
    }
    String ToString() {
        return "The point, x: " + x + "   y: " + y +
                "   xSpeed: " + xSpeed + "   ySpeed: " + ySpeed;
    }
    public void moveX(){
        x += xSpeed;
    }
    public void moveY(){
        y += ySpeed;
    }
}
