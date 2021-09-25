package ru.mirea.task5;

public class Table extends Furniture{
    int height;

    public Table(int length, int width, String color, int price, int height) {
        this.height = height;
        this.setLength(length);
        this.setWidth(width);
        this.setColor(color);
        this.setPrice(price);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getSurfaceArea(){
        return (float)(this.getLength() * this.getWidth())/10000;
    }

    @Override
    public String toString() {
        return "Table{" +
                "height=" + height +
                ", length=" + this.getLength() +
                ", width=" + this.getWidth() +
                ", price=" + this.getPrice() +
                ", color='" + this.getColor() +
                '}';
    }
}
