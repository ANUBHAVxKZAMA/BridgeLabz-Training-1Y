import java.util.*;
	class PalindromeNumber {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt();
		        int i=x, rev=0,lastdig;
		        for(;i>0;i/=10){
		            lastdig=i%10;
		            rev=rev*10+lastdig;
		        }
		        if (rev==x)
		            System.out.println(x+" IS A PALINDROME NUMBER!");
		            else
		            System.out.println(x+" IS NOT A PALINDROME NUMBER!");
	}
}
