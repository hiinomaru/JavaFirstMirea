package ru.mirea.task6;

public class Animal implements Nameable{
    private int weight;
    private String specie;
    private String name;

    public Animal(int weight, String specie, String name) {
        this.weight = weight;
        this.specie = specie;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", specie='" + specie + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
