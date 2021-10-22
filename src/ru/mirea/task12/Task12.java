package ru.mirea.task12;
import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        Student[] arr = new Student[30];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Student((int)(Math.random() * 1000), (int)(Math.random() * 100), "Student" + i);
        }
        for (int i = 0; i < arr.length; i++){
            Student x = arr[i];
            System.out.println(x.IDNumber + "  " + x.score + "  " + x.name);
        }
        Student key;
        for (int i = 1; i < arr.length; i++) { //insertion sort
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].IDNumber < key.IDNumber) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println(" Insertion sort Sorted:");
        for (int i = 0; i < arr.length; i++){
            Student x = arr[i];
            System.out.println(x.IDNumber + "  " + x.score + "  " + x.name);
        }
    }
}
