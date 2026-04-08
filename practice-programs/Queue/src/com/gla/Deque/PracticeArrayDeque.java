package com.gla.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class PracticeArrayDeque {
    public static void main(String [] args){
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addLast(3);
        dq.addFirst(27);
        dq.offerLast(7);
        dq.offerFirst(0);
        // 0 27 3 7
        System.out.println(dq);
        dq.removeFirst(); //can use poll too instead of remove, we have both the fun(s), to remove first and last element
        // 27 3 7
        System.out.println(dq);
        System.out.println(dq.peekFirst());
    }
}
