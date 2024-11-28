package workout;

import java.util.Scanner;

public class single_for_max_mini {
	public static void main(String[] args) {
		Scanner gokul = new Scanner(System.in);
//		Scanner gokuol = new Scanner(System.in);

		System.out.println("enteer the size of the data");
		int size = gokul.nextInt();

		System.out.println("enter the values according to your sizee of the data");
		int given[] = new int[size];
		
		int minimum=0;
		int maximum=0;
		
		for (int i = 1; i < given.length; i++) {
			given[i] = gokul.nextInt();
			
			if(minimum>given[i]) {
				minimum=given[i];
				
			}
			if(maximum<given[i]) {
				maximum=given[i];
			}
		}
		
		System.out.println("the minimum  is: "+minimum);
		System.out.println("the maximum  is: "+maximum);
		gokul.close();

}}
