import java.util.*;
	class MagicNumber {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt();
		        int i,check=0, sum=0;
		        for(i=x;i>0||sum>9;i/=10){
		            sum+=i%10;
		            if(i/10<=0){
		            i=sum;
		            check=i;
		            sum=i%10;
		            }
		        }
		        if(check==1)
		            System.out.println(x+" IS A MAGIC NUMBER!");
		            else
		            System.out.println(x+" IS NOT A MAGIC NUMBER!");
		        }
	}
