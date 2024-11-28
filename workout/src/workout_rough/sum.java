package workout_rough;

import java.util.Scanner;

public class sum {

	public static int summ(int a, int b, int c) {

	  
		return a + b + c ;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value for a: ");
		int a = scanner.nextInt();
		System.out.println("enter the value for b: ");
		int b = scanner.nextInt();
		System.out.println("enter the value for c:");
		int c = scanner.nextInt();

		int total = summ(a, b, c);

		System.out.println("the total is: " + total);

		scanner.close();

	}

}
