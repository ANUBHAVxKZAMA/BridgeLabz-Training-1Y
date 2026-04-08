package com.gla.Queue;

import java.util.PriorityQueue;

public class PracticePriorityQueue {
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
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
