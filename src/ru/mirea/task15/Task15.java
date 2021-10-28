package ru.mirea.task15;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        FileWriter writer = new FileWriter("/Users/igorstarikov/IdeaProjects/JavaFirstMirea/src/ru/mirea/task15/file", false);
        System.out.println("1) input string to file:");
        String text = in.nextLine();
        writer.write(text);
        writer.flush();
        writer.close();
        System.out.println("2) text from file:");
        FileReader reader = new FileReader("/Users/igorstarikov/IdeaProjects/JavaFirstMirea/src/ru/mirea/task15/file");
        char[] buf = new char[256];
        int c;
        while((c = reader.read(buf))>0) {

            if (c < 256) {
                buf = Arrays.copyOf(buf, c);
            }
            System.out.println(buf);
        }
        reader.close();
        System.out.println("3) replace text:");
        writer = new FileWriter("/Users/igorstarikov/IdeaProjects/JavaFirstMirea/src/ru/mirea/task15/file", false);
        text = in.nextLine();
        writer.write(text);
        writer.flush();
        System.out.println("replaced text: " + text);
        System.out.println("4) add text:");
        text = in.nextLine();
        writer.write(text);
        writer.flush();
        FileReader reader2 = new FileReader("/Users/igorstarikov/IdeaProjects/JavaFirstMirea/src/ru/mirea/task15/file");
        char[] buf2 = new char[256];
        int b;
        while((b = reader2.read(buf2))>0){

            if(b < 256){
                buf2 = Arrays.copyOf(buf2, b);
            }
            System.out.print("text from file: ");
            System.out.println(buf2);
        }
    }
}
