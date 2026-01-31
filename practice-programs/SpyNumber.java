import java.util.*; 
class SpyNumber { 
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER:");
      int x=sc.nextInt();
      int i;double sum=0,product=1;
      for(i=x;i>0;i/=10){
          sum+=i%10;
          product*=i%10;
      }
         if(sum==product){
                  System.out.println(x+" IS A SPY NUMBER");
        }
        else{
            System.out.println(x+" IS NOT AN SPY NUMBER");
        }
      }
}
