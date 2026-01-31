mport java.util.*;
	class ReverseNumber {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt(); //TAKING THE NUMBER INPUT FROM USER
		        int rev=0,lastdig;
		        for(;x>0;x/=10){ //X=X/10 WILL REMOVE THE LAST DIGIT FROM THE GIVEN NUMBER
		            lastdig=x%10; //THE VARIABLE LASTDIG WILL SAVE THE LAST DIGIT AS % GIVE THE REMAINDER 
		            rev=rev*10+lastdig; //IT GOES LIKE THIS -> LET THE INPUT BE 769 THEN REV= 0 -> 9 -> 90+6=96 -> 960+7=967
		        }
		        System.out.println("AFTER REVERSING THE NUMBER IS "+rev); //GIVE THE REVERSED NUMBER AS AN OUTPUT		
	}
}
