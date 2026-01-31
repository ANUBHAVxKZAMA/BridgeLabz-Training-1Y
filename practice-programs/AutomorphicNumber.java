import java.util.*; 
class AutomorphicNumber { 
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER:");
      int x=sc.nextInt();
      int i,count=0;double lastdigsq;
      for(i=x;i>0;i/=10){
              count++;
      }
      lastdigsq=(x*x)%(Math.pow(10,count));
         if(lastdigsq==x){
                  System.out.println(x+" IS AN AUTOMORPHIC NUMBER");
        }
        else{
            System.out.println(x+" IS NOT AN AUTOMORPHIC NUMBER");
        }
      }
}
