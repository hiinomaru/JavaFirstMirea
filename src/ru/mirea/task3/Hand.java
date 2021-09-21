package ru.mirea.task3;

public class Hand {
    @Override
    public String toString() {
        return "Hand{" +
                "finger_size=" + finger_size +
                '}';
    }

    public int getFinger_size() {
        return finger_size;
    }

    public void setFinger_size(int finger_size) {
        this.finger_size = finger_size;
    }

    public Hand(int finger_size) {
        this.finger_size = finger_size;
    }

    int finger_size;
}