package ru.mirea.task3;

public class Book{
    private String title;
    private int year;
    private String author;
    Book(int y, String t, String a){
        year = y;
        title = t;
        author = a;
    }
    public String toString() {
        return "This is Book, title: " + title + ", year: " + year + ", author: " + author;
    }
    public String getname() {
        return title;
    }
    public String getauthor() {
        return author;
    }
    public int getyear() {
        return year;
    }
    public void setname(String n) {
        title = n;
    }
    public void setauthor(String a) {
        author = a; }
    public void setyear(int y) {
        year = y;
    }
}
