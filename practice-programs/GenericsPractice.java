package com.gla.codes;

class Number<T>{
    T num;
    void setNumber(T num){
        this.num=num;
    }
    T getNumber(){
        return num;
    }
}
public class GenericsPractice {
    public static void main(String args[]){
        Number<Integer> n1=new Number<>();
        n1.setNumber(69);
        System.out.println(n1.getNumber());
        Number<String> n2=new Number<>();
        n2.setNumber("Hellow Yaawr");
        System.out.println(n2.getNumber());
        Number<Double> n3=new Number<>();
        n3.setNumber(69.69);
        System.out.println(n3.getNumber());
        Number<Float> n4=new Number<>();
        n4.setNumber(69.6969f);
        System.out.println(n4.getNumber());
    }
}