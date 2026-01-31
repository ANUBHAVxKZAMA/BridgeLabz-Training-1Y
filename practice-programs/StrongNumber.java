import java.util.*; 
class StrongNumber { 
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER:");
      int x=sc.nextInt();
      int fact=1,sum=0,i,j,dig;
      for(i=x;i>0;i/=10){
          dig=i%10;
          for(j=dig;j>=1;j--){
              fact*=j;
              }
              sum+=fact;
              fact=1;
      }
              if(sum==x){
                  System.out.println(x+" IS A STRONG NUMBER");
        }
        else{
            System.out.println(x+" IS NOT A STRONG NUMBER");
        }
      }
}
