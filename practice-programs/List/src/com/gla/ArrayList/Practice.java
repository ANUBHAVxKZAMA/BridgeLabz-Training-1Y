package com.gla.ArrayList;

import java.util.*;
public class Practice {
    public static void main(String[] args){
       ArrayList<String> al=new ArrayList<>();
        System.out.println(al);
        al.add("27");
        al.add("03");
        al.add("07");
        al.add("Hellow Yaawr");
        System.out.println(al);
        System.out.println("Using simple For-Loop");
        for(int i=0;i< al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("Using Each-For Loop");
        for(String s: al){
            System.out.println(s);
        }
    }
}