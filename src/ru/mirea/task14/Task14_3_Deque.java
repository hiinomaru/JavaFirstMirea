package ru.mirea.task14;

import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;

public class Task14_3_Deque {
    static Deque <Integer> first = new LinkedList<Integer>();
    static Deque <Integer> second = new LinkedList<Integer>();
    static void fill(Deque <Integer> S, String in){
        String[] cards = in.split(" ");
        for (int i = cards.length - 1 ; i >= 0; i--)
            S.add(Integer.parseInt(cards[i]));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str_f = in.nextLine();
        fill(first, str_f);
        String str_s = in.nextLine();
        fill(second, str_s);
        int i = 0;
        System.out.print(first);
        System.out.println(second);
        while((i < 106) && (!first.isEmpty()) && (!second.isEmpty())){
            if((first.peek() > second.peek()) || ((first.peek() == 0)&&(second.peek() == 9))){
                first.offer(first.poll());
                first.offer(second.poll());
            }
            else if ((first.peek() < second.peek()) || ((first.peek() == 9)&&(second.peek() == 0))){
                second.offer(first.poll());
                second.offer(second.poll());
            }
            ++i;
            System.out.print(first);
            System.out.println(second);
        }
        if(first.isEmpty())
            System.out.println("Winner: second " + i);
        else if(second.isEmpty())
            System.out.println("Winner: first " + i);
        else if(i == 106)
            System.out.println("turn 106: botva");
    }
}
