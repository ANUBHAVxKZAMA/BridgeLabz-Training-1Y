import java.util.*; 
class SunnyNumber { 
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER:");
      int x=sc.nextInt();
      int i,count=0;
      for(i=1;i<=(x+1)/2;i++){
          if(x+1==i*i){
              count++;
              break;
          
      }
      }
         if(count==1){
                  System.out.println(x+" IS A SUNNY NUMBER");
        }
        else{
            System.out.println(x+" IS NOT AN SUNNY NUMBER");
        }
      }
}
