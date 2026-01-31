import java.util.*; 
class DuckNumber { 
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER:");
      int x=sc.nextInt();
      int i,count=0;
      for(i=x;i>0;i/=10){
          if(i%10==0){
              count++;
              break;
      }
      }
         if(count==1){
                  System.out.println(x+" IS A DUCK NUMBER");
        }
        else{
            System.out.println(x+" IS NOT AN DUCK NUMBER");
        }
      }
}
