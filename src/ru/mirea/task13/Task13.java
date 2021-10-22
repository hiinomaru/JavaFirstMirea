package ru.mirea.task13;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i = 1; i < 11; i++){
            arr.add((int) (Math.random() * 100));
        }
        arr.add(99);
        ArrayList<String> copy = (ArrayList<String>) arr.clone();
        System.out.println("1. Arraylist check:");
        System.out.println("arr: " + copy);
        arr.remove(0);
        arr.set(1, 0);
        copy = (ArrayList<String>) arr.clone();
        System.out.println("del: " + copy);
        System.out.println("size: " + arr.size());
        LinkedList<Character> arr2 = new LinkedList<Character>();
        for(int i = 1; i < 11; i++){
            arr2.add((char) (Math.random() * 100));
        }
        System.out.println("2. Linkedlist check:");
        System.out.println("arr: " + arr2);
        arr2.remove(0);
        arr2.set(1, '0');
        System.out.println("del: " + arr2);
        System.out.println("size:" + arr.size());
        MyArrayList <Integer> arr3 = new MyArrayList<Integer>();
        for(int i = 1; i < 11; i++){
            arr3.add((int) (Math.random() * 10000));
        }
        System.out.println("3. MyArraylist check:");
        System.out.println("arr: " + arr3);
        arr3.remove(0);
        arr3.set(1, 0);
        arr3.add(9999);
        System.out.println("del [0], set [1] = 0, add 9999: " + arr3);
        System.out.println("size: " + arr3.size());
        System.out.println("is empty:" + arr3.isEmpty());
    }
}
