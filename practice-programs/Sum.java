import java.util.*;
class Sum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int x=sc.nextInt();
		int ar[]=new int[x];
		int s=0;
		int t,t1=0,t2=0;
		for(int i=0;i<x;i++){
			System.out.println("Enter "+(i+1)+" element of the array");
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter target element:");
		t=sc.nextInt();
		for(int i=0;i<x;i++){
			for(int j=i+1;j<x;j++){
				s+=ar[i]+ar[j];
			    if(s==t){
					t1=i;
				    t2=j;
				    break;
				}
			}
			s=0;
		}
		if(t1!=t2){
			int arr[]={t1,t2};
		    System.out.println("Target sum found at indices:"+Arrays.toString(arr));
		}
	    else{
		    System.out.println("Not found!");
		}
	}
}