import java.util.*;
class MoveZero{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int x=sc.nextInt();
		int ar[]=new int[x];
		int p=0;
		for(int i=0;i<x;i++){
			System.out.println("Enter "+(i+1)+" element of the array");
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<x;i++){
			if(ar[i]!=0){
				ar[p]=ar[i];
				p++;
				}
			}
		for(;p<x;p++)
			ar[p]=0;
		System.out.println("Moved zero array:"+Arrays.toString(ar));
	}
}