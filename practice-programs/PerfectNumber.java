import java.util.*; 
class PerfectNumber { 
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER:");
      int x=sc.nextInt();
      int sum=1,i;
      for(i=2;i<=x/2;i++){
          if(x%i==0){
              sum+=i;
              }
              }
              if(sum==x){
                  System.out.print(x+" IS A PERFECT NUMBER!");
              }
              else{
      System.out.println(x+" IS NOT A PERFECT NUMBER!");
        }
      }
}
