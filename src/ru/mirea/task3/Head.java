package ru.mirea.task3;

public class Head {
    char head_size;

    public char getHead_size() {
        return head_size;
    }

    public Head(char head_size) {
        this.head_size = head_size;
    }

    @Override
    public String toString() {
        return "Head{" +
                "head_size=" + head_size +
                '}';
    }

    public void setHead_size(char head_size) {
        this.head_size = head_size;
    }
}
