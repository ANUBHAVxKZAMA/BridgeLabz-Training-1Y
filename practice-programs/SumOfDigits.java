import java.util.*;
	class SumOfDigits {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt();//TAKING THE NUMBER INPUT FROM USER
		        int sum=0;
		        for(;x>0;x/=10) //X=X/10 WILL REMOVE THE LAST DIGIT FROM THE GIVEN NUMBER
		           sum+=x%10; //X%10 WILL GIVE THE LAST DIGIT PRESENT IN X (% = GIVES THE REMAINDER) AND THE VARIABLE SUM WILL STORE THE SUM OF DIGITS OF THE NUMBER 
		        System.out.println("SUM OF DIGITS IN THE GIVEN NUMBER IS "+sum); //GIVE THE SUM OF THE DIGITS OF THE NUMBER AS AN OUTPUT TO THE USER		
	}
}
