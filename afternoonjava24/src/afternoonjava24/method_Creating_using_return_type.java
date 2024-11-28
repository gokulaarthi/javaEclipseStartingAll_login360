package afternoonjava24;

import java.util.Scanner;

public class method_Creating_using_return_type { 
	
	public static void main(String[] args) {
		
		Scanner gokul=new Scanner(System.in);
		Scanner gokul1=new Scanner(System.in);
		System.out.println("enter the values for a and b");
		int a=gokul.nextInt();
		
		int b = gokul.nextInt();
		System.out.println("enter the values for c and d");
		int c =gokul.nextInt();
		double d = gokul.nextInt();
		
		int total=sum(a,b);
		
		double total1=sum(c,d);
		System.out.println("what type of calculator you want");
		 String inputuser=gokul1.nextLine();
		System.out.println(inputuser);
		
		
		
		gokul.close();
		gokul1.close();
		}

	public static int sum(double d, double e) { 
		
		return (int) (d+e); //type casting one type of data is converted into another type of data type;
	}

	public static int sum(int i, int j) {
		return i+j;
	}
 

}


