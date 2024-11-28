package bank_in;

import java.util.Arrays;

public class Bank {
	
	private String name;
	private String branch;
	private String location;
	private Employee[] listEmployee;
	private Customer[] listCustomer;
	public Bank() {
		super();
		 
	}
	public Bank(String name, String branch, String location, Employee[] listEmployee, Customer[] listCustomer) {
		super();
		this.name = name;
		this.branch = branch;
		this.location = location;
		this.listEmployee = listEmployee;
		this.listCustomer = listCustomer;
	}
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}
	public String getLocation() {
		return location;
	}
	public Employee[] getListEmployee() {
		return listEmployee;
	}
	public Customer[] getListCustomer() {
		return listCustomer;
	}
	@Override
	public String toString() {
		return "Bank name=" + name +
				" branch=" + branch +
				" location=" + location + 
				" listEmployee="
				+ Arrays.toString(listEmployee) + 
				" listCustomer=" + Arrays.toString(listCustomer) + "]";
	}

	 
	
	

}
