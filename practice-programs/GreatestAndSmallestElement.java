import java.util.*;
class GreatestAndSmallestElement{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int x=sc.nextInt();
		int ar[]=new int[x];
		int max=0,min=0;
		for(int i=0;i<x;i++){
			System.out.println("Enter "+(i+1)+" element of the array");
			ar[i]=sc.nextInt();
		}
		min=ar[0];
		max=ar[0];
		for(int i=0;i<x;i++){
			if(max<ar[i])
				max=ar[i];
			else if(min>ar[i])
				min=ar[i];
		}
		System.out.println("Greatest Element= "+max);
		System.out.println("Smallest Element= "+min);
	}
}