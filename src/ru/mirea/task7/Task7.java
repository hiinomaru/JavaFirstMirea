package ru.mirea.task7;


public class Task7 {

    public static void main(String[] args) {
        // 3 упражнение
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); Shape не имеет метода getRadius()
        // , нужно привести к Circle - ((Circle) s1).getRadius()

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); // нельзя создать объект абстрактного класса

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); Shape не имеет метода getLength()
        // , нужно привести к Circle - ((Rectangle) s3).getLength()

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); Shape не имеет метода getSide()
        // , нужно привести к Square - ((Square) s4).getSide()
        // 6 упражнение - точки имеют одинаковую скорость, т. к. к их координатам прибавляется одна и та же переменная
        MovableRectangle M1 = new MovableRectangle(2,3,9,10,3,1);
        System.out.println(M1.ToString());
        M1.moveX();
        M1.moveY();
        System.out.println(M1.ToString());
    }
}

