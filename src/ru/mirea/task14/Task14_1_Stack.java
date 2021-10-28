package ru.mirea.task14;
import java.util.Stack;
import java.util.Scanner;

public class Task14_1_Stack {
    static Stack <Integer> buf = new Stack <Integer>();
    static Stack <Integer> first = new Stack <Integer>();
    static Stack <Integer> second = new Stack <Integer>();
    static void fill(Stack<Integer> S, String in){
        String[] cards = in.split(" ");
        for (String c : cards)
            S.push(Integer.parseInt(c));
    }

    static void flip(Stack<Integer> S, int a, int b){
        while(!S.isEmpty()){
            buf.push(S.pop());
        }
        buf.push(a);
        buf.push(b);
        while(!buf.isEmpty()){
            S.push(buf.pop());
        }
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
                flip(first, first.pop(), second.pop());
            }
            else if ((first.peek() < second.peek()) || ((first.peek() == 9)&&(second.peek() == 0))){
                flip(second, first.pop(), second.pop());
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
