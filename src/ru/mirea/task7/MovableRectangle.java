package ru.mirea.task7;

public class MovableRectangle implements Movable{
    private MovablePoint V1;
    private MovablePoint V2;
    private int width_1;
    private int length_1;
    private int width_2;
    private int length_2;
    private int xSpeed;
    private int ySpeed;
    MovableRectangle(int w_1, int l_1, int w_2, int l_2,int p_x, int p_y){
        V1 = new MovablePoint(w_1 ,l_1 ,p_x, p_y);
        V2 = new MovablePoint(w_2 ,l_2 ,p_x, p_y);
        width_1 = w_1;
        length_1 = l_1;
        width_2 = w_2;
        length_2 = l_2;
        xSpeed = p_x;
        ySpeed = p_y;
    }
    String ToString() {
        return "The rectangle center:, x: " + (width_1 + width_2) / 2 + "   y: " + (length_1 + length_2) / 2 +
                "   xSpeed: " + xSpeed + "   ySpeed: " + ySpeed;
    }
    public void moveX(){
        width_1 += xSpeed;
        width_2 += xSpeed;
        V1.moveX();
        V2.moveX();
    }
    public void moveY(){
        length_1 += ySpeed;
        length_2 += ySpeed;
        V1.moveY();
        V2.moveY();
    }
}
