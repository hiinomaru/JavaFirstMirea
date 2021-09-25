package ru.mirea.task5;

public class Mastiff extends Dog{
    private boolean overweight;

    public Mastiff(int age, String name, int tall, boolean overweight) {
        this.setAge(age);
        this.setName(name);
        this.setTall(tall);
        this.overweight = overweight;
    }

    public String bark(){
        return "Wo-oof!";
    }

    public boolean isOverweight() {
        return overweight;
    }

    public void setOverweight(boolean overweight) {
        this.overweight = overweight;
    }

    @Override
    public String toString() {
        return "Mastiff{" +
                "age=" + this.getAge() +
                ", name='" + this.getName() + '\'' +
                ", tall=" + this.getTall() +
                ", overweight=" + overweight +
                '}';
    }
}
