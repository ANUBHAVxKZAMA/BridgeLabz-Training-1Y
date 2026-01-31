import java.util.*; 
class HarshadOrNivenNumber { 
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER:");
      int x=sc.nextInt();
      int i;double sum=0;
      for(i=x;i>0;i/=10){
          sum+=i%10;
      }
         if(x%sum==0){
                  System.out.println(x+" IS A HARSHAD (NIVEN) NUMBER");
        }
        else{
            System.out.println(x+" IS NOT AN HARSHAD (NIVEN) NUMBER");
        }
      }
}
