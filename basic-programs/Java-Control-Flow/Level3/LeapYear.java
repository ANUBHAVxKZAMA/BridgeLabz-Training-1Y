import java.util.*;
public class LeapYear{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		System.out.println("For loop example:");
		for (int i=1;i<=x;i++)
		{
			for (int j=1;j<=x;j++)
			{
			    System.out.print("*");
			}
		    System.out.println();
		}
		
		System.out.println("While loop example:");
		int i=1;
		while(i<=x)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		int j=0;
		System.out.println("Do-while loop example:");
		do
		{
			System.out.print(j+" ");
			j++;
		}
		while(j<=x);
		
		System.out.println();
	    System.out.println("For-Each loop example:");
		int ar[]={10,20,30,40};
		for(int num: ar)
		{
			System.out.print(num+ " ");
		}
	}
}
		