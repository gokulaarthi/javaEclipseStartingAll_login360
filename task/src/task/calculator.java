package task;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {

		Scanner gokul = new Scanner(System.in);

		System.out.println("give me a first number");
		int a = gokul.nextInt();

		System.out.println("give me the second number");
		int b = gokul.nextInt();

		gokul.nextLine();

		System.out.println("select the operator");
		System.out.println(" ");
		System.out.println("1.addition");
		System.out.println("2.subraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.modulus");
		System.out.println(" ");
		System.out.println("give the operators in number: for.example (addition)input=1 ");
		System.out.println(" ");

		int output = gokul.nextInt();

		int c = a + b;
		int d = a - b;
		int e = a * b;
		double f = a / b;
		int g = a % b;

		switch (output) {
		case 1:
			System.out.println(" addition of two number is: " + c);
			break;

		case 2:
			System.out.println(" subraction of two number is: " + d);
			break;

		case 3:
			System.out.println(" multiplication of two number is: " + e);
			break;
		case 4:
			System.out.println(" division of two number is: " + f);
			break;
		case 5:
			System.out.println(" modulus of two number is: " + g);
			break;
		default:
			System.out.println("please enter the number");

			gokul.close();
		}

	}

}
