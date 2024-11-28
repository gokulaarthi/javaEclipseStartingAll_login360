package workout;

import java.util.Scanner;

public class array_workout {
	public static void main(String[] args) {
		Scanner gokul= new Scanner(System.in);
		Scanner gokul1= new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		
		int size = gokul.nextInt();
		
		System.out.println("enter the values");
		
		String[] names=new String [size];
		
		for(int i=0; i<names.length; i++) {
			names[i]=gokul.nextLine();
		}
		System.out.println("the given datas are ");
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		gokul.close();
		gokul1.close();
	}

}
