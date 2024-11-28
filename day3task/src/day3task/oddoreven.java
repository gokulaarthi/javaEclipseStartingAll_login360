package day3task;
import java.util.Scanner;
public class oddoreven {
	public static void main(String[] args) {
	Scanner gokul=new Scanner(System.in);
	
	System.out.println("enter the number value a: ");
	int a=gokul.nextInt();
	
	System.out.println("Enter the number value b: ");
	int b=gokul.nextInt();
	
	int c=a%2;
	 int c1 =b%2;
	switch(c) {
	case 0:
		System.out.println("the number a is even");
		break;
	default:
		System.out.println("the number a is odd");
	}
	switch (c1) {
	case 0:
		System.out.println("the number b is even");
		break;
		default:
			System.out.println("the number b is odd");
	}
	gokul.close();
    

}}


