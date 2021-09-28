package ru.mirea.task7;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    MovableCircle(int X, int Y, int XSpeed, int YSpeed, int radius){
        center = new MovablePoint(X, Y, XSpeed, YSpeed);
    }
    String ToString() {
        return "The Circle, x: " + center.x + "   y: " + center.y +
                "   xSpeed: " + center.xSpeed + "   ySpeed: " + center.ySpeed + "radius: " + radius;
    }
    public void moveX(){
        center.moveX();
    }
    public void moveY(){
        center.moveY();
    }
}
