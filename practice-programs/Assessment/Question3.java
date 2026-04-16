package com.gla.Assessment;

public class Question3 {
    public static void main(String[] args) {
        String s = "101010";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                s1 += '1';
            } else
                s1 += s.charAt(i);
        }
        System.out.println(s1);
}
}
