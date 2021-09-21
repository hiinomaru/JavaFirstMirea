package ru.mirea.task3;

public class Circle {
    private int radius;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getPerimeter() {
        return (int) (radius * 2 * 3.14);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
