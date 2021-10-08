package ru.mirea.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static <args> void main(String[] args) {
        int[] array;
        int Sum = 0;
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
            Sum += array[i];
            //System.out.print(array[i] + " ");
        }
        System.out.println("№3");
        System.out.println(Arrays.toString(array));
        System.out.println("Sum is: " + Sum);
        System.out.println("№4");
        for(int i=0; i < args.length; i++)
            System.out.println("args[" + i + "] : " + args[i]);
        System.out.println("№5");
        for(double i=1; i < 10; i++){
            double r = (1/i);
            System.out.print(r + "   ");
        }
        System.out.println();
        System.out.println("№6");
        System.out.println("unsorted: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("sorted: " + Arrays.toString(array));
        System.out.println("№7");
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();
        int N = 1;
        for(int i=1; i <= C; i++){
            N *= i;
        }
        System.out.println(N);
    }
}
