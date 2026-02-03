import java.util.*;
class SumOfElements2d{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row length of the array:");
		int x=sc.nextInt();
		System.out.println("Enter the column length of the array:");
		int y=sc.nextInt();
		int ar[][]=new int[x][y];
		int s=0;
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
			System.out.println("Enter "+(i+1)+","+(j+1)+" element of the array");
			ar[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
			s+=ar[i][j];
			}
		}
		System.out.println("Sum of elements= "+s);
	}
}