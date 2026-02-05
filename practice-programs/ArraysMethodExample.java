import java.util.Scanner;
import java.util.Arrays;
class ArraysMethodExample{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int ar[]={94,56,3,8,27};
		int ar1[]={10,20,30,40,27};
		int ar2[]={94,56,3,8,27};
		boolean isEqual;
		int i;
		System.out.println("Original Array without using toString:" +ar);
		System.out.println("Original Array using toString:" +Arrays.toString(ar));
		isEqual=Arrays.equals(ar,ar1);
		System.out.println("Is array one equal to the original array: "+isEqual);
		isEqual=Arrays.equals(ar,ar2);
		System.out.println("Is array two equal to the original array: "+isEqual);
		Arrays.sort(ar);
		System.out.println("Sorted Array:" +Arrays.toString(ar));
		i=Arrays.binarySearch(ar,27);
		System.out.println("27 is present on the index: "+i);
		Arrays.fill(ar,27);
		System.out.println("Filled Array:" +Arrays.toString(ar));
	}
}
		