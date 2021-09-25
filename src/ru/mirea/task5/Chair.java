package ru.mirea.task5;

public class Chair extends Furniture{
    private boolean plastic;
    public Chair(int length, int width, String color, int price, boolean plastic) {
        this.plastic = plastic;
        this.setLength(length);
        this.setWidth(width);
        this.setColor(color);
        this.setPrice(price);
    }

    public boolean isPlastic() {
        return plastic;
    }

    public void setPlastic(boolean plastic) {
        this.plastic = plastic;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "plastic=" + plastic +
                ", length=" + this.getLength() +
                ", width=" + this.getWidth() +
                ", price=" + this.getPrice() +
                ", color='" + this.getColor() +
                '}';
    }
}
