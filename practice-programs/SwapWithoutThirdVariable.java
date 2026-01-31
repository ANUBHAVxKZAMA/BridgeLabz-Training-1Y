import java.util.*;
	class SwapWithoutThirdVariable {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER 1ST NUMBER:");
		        int x=sc.nextInt(); //TAKING THE 1ST NUMBER INPUT FROM THE USER 
		        System.out.println("ENTER 2ND NUMBER:");
		        int y=sc.nextInt(); //TAKING THE 2ND NUMBER INPUT FROM THE USER 
		        System.out.println("BEFORE SWAPPING THE NUMBERS ARE "+x+" AND " +y); //DISPLAYING THE VALUES TO THE USER BEFORE SWAPPING 
		        x+=y; //ADDING BOT THE NUMBERS (LIKE LET THE NUMBERS BE 5 & 10 RESPECTIVELY SO HERE 5+10=15);
		        y=x-y; //SUBSTRACTING THE VALUE OF 2ND NUMBER FROM TOTAL WILL GIVE THE VALUE OF 1ST NUMBER (LIKE 15-10=5)
		        x-=y; //SUBSTRACTING THE VALUE OF 1ST NUMBER (AS NOW Y HOLDS SAME VALUE AS 1ST NUMBER BECAUSE OF THE PREVIOUS STEP) FROM TOTAL WE WILL GET VALUE OF 2ND NUMBER. 
		        System.out.println("AFTER SWAPPING THE NUMBERS ARE "+x+" AND " +y); // DISPLAYING THE VALUE TO THE USER AFTER SWAPPING		
	}
}
