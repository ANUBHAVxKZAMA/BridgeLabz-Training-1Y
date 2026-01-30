import java.util.*;
public class SumTillZero2{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int x,s=0;
		System.out.println("Enter number(s):");
		while(true)
		{
		    x=sc.nextInt();
			if(x>=0)
				s+=x;
			else
				break;
		}
		System.out.println("Sum= "+s);
	}
}