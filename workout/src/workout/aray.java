package workout;

import java.util.Scanner;

public class aray {
	public static void main(String[] args) {
		Scanner aarthi = new Scanner(System.in);
		Scanner aarthi0 = new Scanner(System.in);
		
		System.out.println("enter the size of the aaray");
		int size = aarthi.nextInt();
		
		String [] marks = new String[size];
		
		System.out.println("enter the values");
		
		for( int i=0;i<marks.length;i++) {
			  marks [i]=aarthi0.nextLine();
		}
		
		System.out.println("the marks are");
		
		for( int i=0;i<marks.length;i++) {
			  System.out.println(marks[i]);  
		}
		aarthi.close();
		aarthi0.close();
	}

}
