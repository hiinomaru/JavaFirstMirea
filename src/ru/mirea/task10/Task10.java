package ru.mirea.task10;
import java.util.Scanner;

public class Task10 {
    static int func_9(int a, int b) {
        if((b - a) < -1)
            return 0;
        if((a == 0) || (b == 0))
            return 1;
        return func_9(a, b-1) + func_9(a-1, b-1);
    }

    public static int func_10(int n, int i) {
        if (n==0)
            return i;
        else
            return func_10( n/10, i*10 + n%10 );
    }

    public static int func_11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int n_1 = in.nextInt();
            if (n_1 == 1) {
                return func_11() + n + n_1;
            }
            else {
                int n_2 = in.nextInt();
                if (n_2 == 1) {
                    return func_11() + n + n_1 + n_2;
                }
                else {
                    return n + n_1 + n_2;
                }
            }
        }
        else {
            int n_1 = in.nextInt();
            if (n_1 == 1) {
                return func_11() + n + n_1;
            }
            else {
                return n + n_1;
            }
        }
    }

    public static void func_12() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                func_12();
            }
            else {
                func_12();
            }
        }
    }

    public static void func_13() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                func_13();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(func_9(4,6));
        System.out.println(func_10(1278,0));
        //func_11();
        //func_12();
        func_13();
    }
}

