package com.gla.LinkedList;

import java.util.*;
public class Practice {
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll);
        ll.set(0,27);
        System.out.println(ll);
        ArrayList<Integer> al=new ArrayList<>(); //created an object to implement addAll function
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        ll.addAll(al);
        System.out.println(ll);
        ll.addAll(1,al);
        System.out.println(ll);
    }
}
