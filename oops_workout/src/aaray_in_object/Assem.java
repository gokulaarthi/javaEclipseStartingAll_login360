package aaray_in_object;

import java.util.Scanner;

public class Assem {
	
	public static void main(String[] args) {
		
		  Scanner scanner =new Scanner(System.in);
	  Scanner scanner1 =new Scanner(System.in);
		 	  Employee [] arrayname=new Employee [5];
	  for(int i=0;i<arrayname.length;i++) {
		  System.out.println("enter "+(i+1)+" employe name");
		  String name=scanner.nextLine();
		  System.out.println("age");
		  int age=scanner1.nextInt();
		  System.out.println("enter phone number number");
		  int mobileNumber=scanner1.nextInt();
		  System.out.println("======");
		  	  
		  Employee employee =new Employee(name, age, mobileNumber);
		  arrayname[i]=employee;
		  
	  }
		  for(int j=0;j<arrayname.length;j++) {
			  System.out.println("employe"+(j+1));
			  System.out.println("name:"+" "+arrayname[j].getnameEmploye());
			  System.out.println( "Age: "+arrayname[j].getAge());
			  System.out.println("Mobile no: "+arrayname[j].getPhoneNumber());
			  System.out.println(" ");
			  
		  }
	  scanner.close();
	  scanner1.close();
	}
}
