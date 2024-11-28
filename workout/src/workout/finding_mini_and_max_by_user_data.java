package workout;

import java.util.Scanner;

public class finding_mini_and_max_by_user_data {
	public static void main(String[] args) {
		Scanner gokul = new Scanner(System.in);
//		Scanner gokuol = new Scanner(System.in);

		System.out.println("enteer the size of the data");
		int size = gokul.nextInt();

		System.out.println("enter the values according to your sizee of the data");
		int given[] = new int[size];
		
		for (int i = 0; i < given.length; i++) {
			given[i] = gokul.nextInt();
		}
//		int maximum = given[0];
		int minimum = given[0];

		for (int i = 0; i < given.length; i++) {
//			if (maximum < given[i]) {
//				maximum = given[i];
//			}
			if (minimum > given[i]) {
				minimum = given[i];
			}
		}
//		System.out.println("the maximum value is: " + maximum);
		System.out.println("the minimum value is: " + minimum);
		
		gokul.close();
//		gokuol.close();

	}
}
