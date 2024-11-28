package afternoonjava24;

import java.util.Scanner;

public class Array_dyanmic {
	public static void main(String[] args) {
		Scanner gokul= new Scanner(System.in);
		
		System.out.println("enter the size of the arrry");
		int size = gokul.nextInt();
		
		
		System.out.println("eneter hre values");
		int marks[]=new int[size];
		
		for(int i=0; i<marks.length;i++) {
			marks[i]=gokul.nextInt();
		}
		System.out.println("the values are");
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]+" ");
		}
		gokul.close();
		
	}

}  