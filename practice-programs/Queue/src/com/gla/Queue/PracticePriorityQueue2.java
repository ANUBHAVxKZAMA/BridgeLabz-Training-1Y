package com.gla.Queue;

import java.util.*;

public class PracticePriorityQueue2 {
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(27);
        pq.offer(3);
        pq.offer(7);
        pq.offer(6);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
