package afternoonjava24;

import java.util.Scanner;

public class scanner12 {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("eneter the numer1");//ln new line
		int numer1 = name.nextInt();
		System.out.println("eneter the number2");
		int number2 = name.nextInt();
		System.out.println("eneter a number3");
		int number3 = name.nextInt();
		System.out.println("eneter a number4");
		int number4 = name.nextInt();
		System.out.println("the give value is: "+numer1);
		System.out.println("numer1 is: " + numer1);
		System.out.println("number2 is: " + number2);
		System.out.println("number3 is: " + number3);
		System.out.println("number4 is: " + number4);
		System.out.println("  "); //used to create a space 
		System.out.println("total is : " + (numer1 + number2 + number3 + number4));
		name.close();

	}
}
