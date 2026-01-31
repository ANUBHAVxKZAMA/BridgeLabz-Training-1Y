import java.util.*; 
class NeonNumber { 
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER:");
      int x=sc.nextInt();
      int i=x*x,sum=0;
      for(;i>0;i/=10){
              sum+=i%10;
      }
              if(sum==x){
                  System.out.println(x+" IS A NEON NUMBER");
        }
        else{
            System.out.println(x+" IS NOT A NEON NUMBER");
        }
      }
}
