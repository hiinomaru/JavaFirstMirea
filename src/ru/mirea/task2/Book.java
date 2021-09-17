package ru.mirea.task2;

public class Book {
    private int year;
    private String title;
    private String author;
    Book(int y, String t, String a){
        year = y;
        title = t;
        author = a;
    }
    public String toString(){
        return "This is Book, title: " + title + " year: " + year + " author: " + author;
    }
}
