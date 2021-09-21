package ru.mirea.task3;

public class Leg {
    private int feet_size;

    public Leg(int feet_size) {
        this.feet_size = feet_size;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "feet_size=" + feet_size +
                '}';
    }

    public int getFeet_size() {
        return feet_size;
    }

    public void setFeet_size(int feet_size) {
        this.feet_size = feet_size;
    }
}
