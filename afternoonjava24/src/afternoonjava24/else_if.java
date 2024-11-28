package afternoonjava24;

import java.util.Scanner;

public class else_if {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("eneter the age"); 
		int age = name.nextInt();
		if (age<=10) {
			System.out.println("kids");}
		
			else if(age>=30) {
				System.out.println("adult");
			}
			else if(age==25) {
				System.out.println("tenage");
			}
			else {
				System.out.println("invalid");
			}
		name.close();              }
	}

