package com.gla.Assessment;

public class Question10 {
    public static void main(String[] args){
        int c=1;
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(c);
                c++;
            }
            for (int l=1;l<i;l++){
                System.out.print(c);
                c++;
            }
            System.out.println();
            c=1;
        }
        for(int i=1;i<=5;i++){
            for(int j=i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=4;k>=i;k--){
                System.out.print(c);
                c++;
            }
            for (int l=4;l>i;l--){
                System.out.print(c);
                c++;
            }
            System.out.println();
            c=1;
        }
    }
}
