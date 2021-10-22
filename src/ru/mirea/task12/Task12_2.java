package ru.mirea.task12;

public class Task12_2 {

    public static void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i].score > opora.score) {
                i++;
            }
            while (array[j].score < opora.score) {
                j--;
            }
            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        Student[] arr = new Student[30];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Student((int)(Math.random() * 1000), (int)(Math.random() * 100), "Student" + i);
        }
        for (int i = 0; i < arr.length; i++){
            Student x = arr[i];
            System.out.println(x.IDNumber + "  " + x.score + "  " + x.name);
        }
        System.out.println("Quicksort Sorted:");
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++){
            Student x = arr[i];
            System.out.println(x.IDNumber + "  " + x.score + "  " + x.name);
        }
    }
}
