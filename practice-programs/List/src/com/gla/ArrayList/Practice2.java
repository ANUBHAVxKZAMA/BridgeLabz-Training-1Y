package com.gla.ArrayList;

import java.util.*;
public class Practice2 {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<>();
        System.out.println(al);
        al.add("27");
        al.add("03");
        al.add("07");
        al.add("Hellow Yaawr");
        System.out.println(al);
        ArrayList<String> al2=new ArrayList<>();
        al2.add("06");
        al2.add("02");
        al2.add("07");
        al2.add("Bolo Yaawr");
        System.out.println(al2);
        //addAll method
        al.addAll(al2);
        System.out.println(al);
        //isEmpty method
        System.out.println(al.isEmpty());
        System.out.println((al2.contains("5")));
        System.out.println(al.containsAll(al2));
        System.out.println(al.indexOf("07"));
    }
}