package ru.mirea.task5;

public class Teapot extends Bowl{
    private int number_of_cups = 0;
    Teapot(String c, String s){
        super(c,s);
    }
    public void use() {
        isFull = true;
        isClean = false;
        number_of_cups = 4;
    }
    void empty(){
        if (number_of_cups > 0)
            number_of_cups--;
        else
            isFull = false;
    }

    @Override
    public String toString() {
        return "This is Teapot{" +
                "isFull=" + isFull +
                ", isClean=" + isClean +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", number_of_cups=" + number_of_cups +
                '}';
    }
}
