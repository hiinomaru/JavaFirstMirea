package ru.mirea.task5;

public class Bowl extends Dish {
    boolean isFull;
    Bowl(String c, String s){
        color = c;
        shape = s;
    }

    @Override
    public String toString() {
        return "This is Bowl{" +
                "isFull=" + isFull +
                ", isClean=" + isClean +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }

    public void use() {
        isFull = true;
        isClean = false;
    }
    void empty(){
        isFull = false;
    }
}
