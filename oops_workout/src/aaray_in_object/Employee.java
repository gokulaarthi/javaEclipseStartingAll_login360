package aaray_in_object;

public class Employee {
	
	private String nameEmploye;
	private int Age;
	private long phoneNumber;
	
	public Employee (String name,int age,long id) {
		this.Age=age;
		this.phoneNumber=id;
		this.nameEmploye=name;
	}
	
	public String getnameEmploye() {
		return nameEmploye;
		
	}
	public int getAge() {
		return Age;
	
	}
	public long getPhoneNumber() {
		return phoneNumber;
		
	}

}
