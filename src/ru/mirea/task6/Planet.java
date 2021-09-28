package ru.mirea.task6;

public class Planet implements Nameable{
    private int radius;
    private int mass;
    private String name;

    public Planet(int radius, int mass, String name) {
        this.radius = radius;
        this.mass = mass;
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "radius=" + radius +
                ", mass=" + mass +
                ", name='" + name + '\'' +
                '}';
    }
}
