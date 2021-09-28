package ru.mirea.task6;

public class Phone implements Priceable{
    private int price;
    private String model;
    private String company;

    public Phone(int price, String model, String company) {
        this.price = price;
        this.model = model;
        this.company = company;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
