package ru.mirea.task2;

import java.util.Random;

public class TestDog {
    private int amount = 0;
    private Dog[] array = new Dog[100];
    void Dogs(int a){
        amount += a;
        for(int i = 0; i < a; i++){
            Random rand = new Random();
            int Age = rand.nextInt(15);
            array[i] = new Dog(Age, "Bobik");
        }
    }
    public String toString(){
        String s = "";
        for(int i = 0; i < amount; i++){
            s += array[i].toString() + "\n";
        }
        return s;
    }
}
