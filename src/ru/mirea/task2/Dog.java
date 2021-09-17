package ru.mirea.task2;

public class Dog {
    private int age;
    private String name;
    Dog(int a, String n){
        age = a;
        name = n;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    void setAge(int a){
        age = a;
    }
    void setName(String n){
        name = n;
    }
    public String toString(){
        return "This is Dog, age: " + age + " name: " + name;
    }
    int toHumanAge(){
        return  age * 7;
    }
}
