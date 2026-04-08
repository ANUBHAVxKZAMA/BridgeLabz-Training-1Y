package com.gla.Queue;

import java.util.*;

public class Practice {
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(27);
        q.offer(3);
        q.offer(7);
        System.out.println(q);
        System.out.println(q.peek()); //1st element ie 27
        System.out.println(q.element()); //same as .peek();
        q.remove(); //removes first element
        q.poll(); //same as .remove();
        System.out.println(q);
        System.out.println(q.size()); //size pf queue
        System.out.println(q.contains(69));
    }
}
