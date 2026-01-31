import java.util.*;
	class CountDigits {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt();//TAKING THE NUMBER INPUT FROM THE USER
		        int count=0;//A VARIABLE TO COUNT THE NUMBER OF DIGITS 
		        for(;x>0;x/=10)//X=X/10 REMOVES THE LAST DIGIT FROM THE NUMBER.
		           count++;//IT INCREASES AS THE DIGITS ARE REMOVED FROM THE GIVEN NUMBER. LIKE IF A NUMBER HAS 4 DIGITS "5679" THEN THE LOOP WILL REMOVE THE DIGITS ONE BY ONE 4 TIMES AND THE COUNTER VARIABLE WILL COUNT IT AND HENCE WE WILL GET THE NUMBER OF DIGITS PRESENT IN THE GIVEN NUMBER I.E., 4.
			//IT WILL GO LIKE 5679 -> 567 -> 56 -> 5
		        System.out.println("NUMBER OF DIGITS IN THE GIVEN NUMBER IS "+count); //DISPLAYING THE OUTPUT		
	}
}
