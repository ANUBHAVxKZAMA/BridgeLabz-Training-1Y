import java.util.*;
class SumOfElements{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int x=sc.nextInt();
		int ar[]=new int[x];
		int s=0;
		for(int i=0;i<x;i++){
			System.out.println("Enter "+(i+1)+" element of the array");
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<x;i++){
			s+=ar[i];
		}
		System.out.println("Sum of elements= "+s);
	}
}