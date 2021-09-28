package ru.mirea.task6;

public class Flat implements Priceable{
    int price;
    int area;
    String district;

    public Flat(int price, int area, String district) {
        this.price = price;
        this.area = area;
        this.district = district;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "price=" + price +
                ", area=" + area +
                ", district='" + district + '\'' +
                '}';
    }
}
