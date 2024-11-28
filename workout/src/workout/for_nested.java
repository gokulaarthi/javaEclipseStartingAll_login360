package workout;

import java.util.Scanner;

public class for_nested {
	
	public static void main(String[] args) {
		
		Scanner gokul = new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		int size = gokul.nextInt();
		
		int files[]=new int[size];
		
		
		System.out.println("enteer the valuees");
		
		for(int i=0;i<files.length;i++) {
			files[i] = gokul.nextInt();
		}
		
		for(int i=0;i<files.length;i++) {
			for(int j=i+1;j<files.length;j++) {
				
				for(int k=0;k<1;k++) {
				System.out.println("the i value is: " +files[i]+" "+"the value of j: "+files[j]);
				System.out.println("the total is:" +(files[i]+files[j]) );
//				}
			}
		}
	 gokul.close();
	}

	}}
