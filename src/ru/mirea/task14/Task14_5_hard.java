package ru.mirea.task14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class Task14_5_hard {
    static LinkedList<Integer> first = new LinkedList<Integer>();
    static LinkedList <Integer> second = new LinkedList<Integer>();
    static void fill(LinkedList <Integer> A, LinkedList <Integer> B){
        ArrayList<Integer> buf = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            buf.add(i);
        for (int i = 0; i < 5; i++){
            int a = (int)((Math.random()*10)%(buf.size()));
            A.push(buf.remove(a));
            int b = (int)((Math.random()*10)%(buf.size()));
            B.push(buf.remove(b));
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Let`s begin \n Enter your name:");
        String name = in.nextLine();
        fill(first, second);
        int i = 0;
        System.out.println(name + " deck: " + first);
        System.out.println("bot deck: " + second);
        while((i < 106) && (!first.isEmpty()) && (!second.isEmpty())){
            System.out.println(name + " deck: " + first.peek());
            System.out.println("bot deck: " + second.peek());
            if((first.peek() > second.peek()) || ((first.peek() == 0)&&(second.peek() == 9))){
                System.out.println(first.peek() + " > " + second.peek());
                first.offer(first.poll());
                first.offer(second.poll());
            }
            else if((first.peek() < second.peek()) || ((first.peek() == 9)&&(second.peek() == 0))){
                System.out.println(first.peek() + " < " + second.peek());
                second.offer(first.poll());
                second.offer(second.poll());
            }
            ++i;
        }
        if(first.isEmpty())
            System.out.println("Winner: bot " + i);
        else if(second.isEmpty())
            System.out.println("Winner: " + name + " " + i);
        else if(i == 106)
            System.out.println("turn 106: botva");
    }
}
