import java.util.*;
	class ArmstrongNumber {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt();
		        int i=x, arm=1,lastdig,count=0,j,sum=0;
		        for(;i>0;i/=10)
		        {
		            count++;
		        }
		        i=x;
		        for(;i>0;i/=10){
		            lastdig=i%10;
		            for(j=1;j<=count;j++)
		            {
		            arm*=lastdig;
		        }
		        sum+=arm;
		        arm=1;
		        }
		        if (sum==x)
		            System.out.println(x+" IS AN ARMSTRONG NUMBER!");
		            else
		            System.out.println(x+" IS NOT AN ARMSTRONG NUMBER!");
	}
}
