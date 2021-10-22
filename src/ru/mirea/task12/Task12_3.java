package ru.mirea.task12;

public class Task12_3 {
    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].score <= r[j].score) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        Student[] arr1 = new Student[10];
        System.out.println("arr1");
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = new Student((int)(Math.random() * 1000), (int)(Math.random() * 100), "Person" + i);
        }
        for (int i = 0; i < arr1.length; i++){
            Student x = arr1[i];
            System.out.println(x.IDNumber + "  " + x.score + "  " + x.name);
        }
        Student[] arr2 = new Student[10];
        System.out.println("arr2");
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = new Student((int)(Math.random() * 1000), (int)(Math.random() * 100), "Student" + i);
        }
        for (int i = 0; i < arr2.length; i++){
            Student x = arr2[i];
            System.out.println(x.IDNumber + "  " + x.score + "  " + x.name);
        }
        System.out.println("Mergesort Sorted:");
        Student[] Marr = new Student[20];
        merge(Marr, arr1, arr2, 10,10);
        mergeSort(Marr, Marr.length);
        for (int i = 0; i < Marr.length; i++){
            Student x = Marr[i];
            System.out.println(x.IDNumber + "  " + x.score + "  " + x.name);
        }
    }
}
