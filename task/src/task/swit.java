package task;
import java.util.Scanner;
public class swit {
	
	public static void main(String[] args) {
		Scanner gokul=new Scanner(System.in);
		System.out.println("eneter any number");
		int a =gokul.nextInt();
		 
	
		switch(a)
		{
		case 1 :
			System.out.println("niumber is one");
		 break;
		case 2:
			System.out.println("the number is two");
			 break;
		case 3:
			System.out.println("the number is three");
			 break;
		case 4:
			System.out.println("the number is four");
			 break;
		default :
			System.out.println("you are unluky to say the number");
			
		}
		gokul.close();
	}

}
