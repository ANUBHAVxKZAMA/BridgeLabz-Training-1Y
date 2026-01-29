import java.util.*;
public class SwitchCase{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("CHOOSE A NUMBER BW 1 & 5:");
		int x=sc.nextInt();
		switch(x)
		{
			case 1:
			System.out.println("HELLO YAAWR!!");
			break;
			case 2:
			System.out.println("HOLA AMIGO!!");
			break;
			case 3:
			System.out.println("NAMASTE!!");
			break;
			case 4:
			System.out.println("BONJOUR!!");
			break;
			case 5:
			System.out.println("KA HO KAISAN BADA?");
			break;
			default:
			System.out.println("ENTER A NUMBER BW 1-5!!!!!!!!");
		}
	}
}
			
			