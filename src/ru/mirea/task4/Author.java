package ru.mirea.task4;

public class Author{
    String name;
    String email;
    char gender;
    Author(String n, String e, char g){
        name = n;
        email = e;
        gender = g;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    char getGender(){
        return gender;
    }
    void setEmail(String e){
        email = e;
    }
    public String toString(){
        return "Name: " + name + "   E-mail: " + email + "   Gender: " + gender;
    }
}
