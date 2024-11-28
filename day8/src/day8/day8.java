package day8;

import java.util.Scanner;

public class day8 {

	public static void main(String[] args) {
		Scanner gokul = new Scanner(System.in);
		System.out.println("enter the number for value a: ");
		int a = gokul.nextInt();
		System.out.println("enter the value for b: ");
		int b = gokul.nextInt();
		int c = a % b;
		System.out.println(c);
		gokul.close();

	}
}

