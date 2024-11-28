package bank_in;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank_Main {
	
	public static void main(String[] args) {
		
		//Tansition list
		Transition[] lisTransition1=new Transition[2];
		Transition transition=new Transition("0001", "23-01-2004", 4000,"debit");
		Transition transition2=new Transition("0001", "24-01-2004", 900,"credit");
		lisTransition1[0]=transition;
		lisTransition1[1]=transition2;
		
		
		Transition[] lisTransition2=new Transition[2];
		Transition transition1=new Transition("0002", "10-02-2014", 4550,"debit");
		Transition transition02=new Transition("0002", "05-10-2024", 1900,"credit");
		lisTransition1[0]=transition1;
		lisTransition1[1]=transition02;
		
//		acountlist
//		ArrayList<Account> listAccounts=new ArrayList<Account>();
		Account[] listAccounts1=new Account[1];
		Account account=new Account(2500, 000000001, lisTransition1);
		listAccounts1[0]=account;
		//account ethananalum irukalaum so indiduval aray.
		Account[] listAccounts2=new Account[1];
		Account account2=new Account(500,002,lisTransition2);
		listAccounts2[0]=account2;
		
		
		
//		customerlist
		Customer [] listCustomers=new Customer[2];
		Customer customer=new Customer("Aarthi", "sc001",listAccounts1 );
		Customer customer2=new Customer("senbagam", "sc002", listAccounts2);
		listCustomers[0]=customer;
		listCustomers[1]=customer2;
		
		///employess
		Employee[] listofEmployees = new Employee[2];
		Employee employee=new Employee("lenin",29, "ss001");
		Employee employee2=new Employee("renger", 25, "ss002");
		listofEmployees[0]=employee;
		listofEmployees[1]=employee2;
		
	
		
		
		Bank bank = new Bank("Siva_siva", "paparapatti", "paparapatti", listofEmployees,listCustomers);
		
		
System.out.println(Arrays.toString(lisTransition2));
		
	}

 

	  

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//				//employee info
//		Employee [] listEmployees= new Employee[2];
//		listEmployees[0]=new Employee("gokul", 21, "001");
//		listEmployees[1]=new Employee("renger", 20, "002");
//		
//		
//		//transation
//		Transition []listTransition1= new Transition[2];
//		listTransition1[1]=new Transition("12345", "23-01-2004", 500,"debit");
//		Transition []listTransition2= new Transition[2];
//		listTransition2[2]=new Transition("12345", "24-01-2005",200 , "crediti");
//		
//		
//		//account
//		
//		Account [] listAccount = new Account[2];
//		listAccount[0]=new Account(1000, 123456789, listTransition1);
//		listAccount[1]=new Account(200,123456,listTransition2); 
//		
//		
//		
//		Customer [] listcuCustomers=new Customer[2];
//		Customer customer1=new Customer("gokul", "cid01", null);
//		Customer customer2=new Customer("customer2","cid02",null);
//		listcuCustomers[0]=customer1;
//		listcuCustomers[1]=customer2;
//		
//		Bank bank = new Bank("bank1", "velachery", "chennai", null, null);//last two are employee and customers ku
	

	
	 

}
