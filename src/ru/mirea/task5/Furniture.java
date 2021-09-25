package ru.mirea.task5;

public abstract class Furniture {
    private int length;
    private int width;
    private int price;
    private String color;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "length=" + length +
                ", width=" + width +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
