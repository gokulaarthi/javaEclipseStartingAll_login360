package afternoonjava24;

import java.util.Scanner;

public class array_by_string_and_int {
	public static void main(String[] args) {
		
	
	Scanner gokul=new Scanner(System.in);
	
	Scanner gokul1 = new Scanner (System.in);
	
	System.out.println("enter the size of the array");
	
	int size =gokul.nextInt();
	
	
	System.out.println("enter the names");
	
	String names[]=new String[size];
	
	for(int i=0;i<names.length;i++) {
		names[i]=gokul1.nextLine();
//		System.out.println();  summa tha intha line ithu space tharum inout user kitta irundhu vangum pothu
		
	}
	
	System.out.println("the names are");
	
	for(int
			i=0;i<names.length;i++) {
		 System.out.println(names[i]);
		
	}
	gokul.close();
	gokul1.close();

}}