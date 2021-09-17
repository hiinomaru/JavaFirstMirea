package ru.mirea.task2;

public class Ball {
    private String color;
    private int diameter;

    public Ball(String n, int a) {
        color = n;
        diameter = a;
    }

    public Ball(int a) {
        diameter = a;
    }

    public Ball() {
        diameter = 10;
        color = "none";
    }

    public void setColor(String c) {
        color = c;
    }

    public void setDiameter(int d) {
        diameter = d;
    }

    public String getColor(String name) {
        return color;
    }

    public int getDiameter() {
        return diameter;
    }

    public String Info() {
        return "This is Ball, color: " + this.color + "   diameter: " + this.diameter;
    }

    public double volume() {
        return Math.pow(diameter, 3) * 4 / 3 * 3.14;
    }
}

