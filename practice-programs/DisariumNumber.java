import java.util.*; 
class DisariumNumber { 
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER:");
      int x=sc.nextInt();
      int i;double sum=0,count=0;
      for(i=x;i>0;i/=10){
          count++;
      }
      for(i=x;i>0;i/=10){
              sum+=Math.pow(i%10,count);
              count--;
      }
         if(sum==x){
                  System.out.println(x+" IS A DISARIUM NUMBER");
        }
        else{
            System.out.println(x+" IS NOT AN DISARIUM NUMBER");
        }
      }
}
