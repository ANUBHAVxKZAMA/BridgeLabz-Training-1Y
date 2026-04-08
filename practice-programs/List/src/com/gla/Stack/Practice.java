package com.gla.Stack;

import java.util.*;
public class Practice {
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        s.pop(); //removing the top element in the stack i.e. 4
        System.out.println(s);
        System.out.println(s.peek()); //printing the top element in the stack i.e. 3
        System.out.println(s.isEmpty()); //check if its empty
        System.out.println(s.size()); //size of the stack i.e. 3
        s.clear(); //clearing all the elements from the stack
        System.out.println(s);
    }
}