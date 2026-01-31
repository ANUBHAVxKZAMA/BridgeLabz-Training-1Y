import java.util.*; 
class PrintDigits { 
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER:");
      int x=sc.nextInt(); 
      System.out.println("THE DIGITS PRESENT IN THE NUMBER IS/ARE:");
        for(;x>0;x/=10){ 
        System.out.println(x%10);
        }
      }
}