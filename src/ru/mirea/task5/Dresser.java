package ru.mirea.task5;

public class Dresser extends Furniture{
    private int height;
    public Dresser(int length, int width, String color, int price, int height) {
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

    public  float getVolume(){
        return (height * this.getLength() * this.getWidth())/1000;
    }

    @Override
    public String toString() {
        return "Dresser{" +
                "height=" + height +
                ", length=" + this.getLength() +
                ", width=" + this.getWidth() +
                ", price=" + this.getPrice() +
                ", color='" + this.getColor() +
                '}';
    }
}
