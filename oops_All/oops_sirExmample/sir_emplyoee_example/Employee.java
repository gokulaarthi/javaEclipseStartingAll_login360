package sir_emplyoee_example;

public class Employee {
	//small la cr0eate pana kudathu first letter caps la than irukanum

	
	private	String employeeName;// ithulam attributes 
		
	private	int age; // inth attribute intha class la mattum tha access panna mudiyium so private
		
	private	String employeeId;//vera endha class la aacess panna mudiyathu (attributes)

	///right click pannitu source kuduthu generate getter and setter kudutha create airum
	//onu getter onu setter create agum

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) { //parameter ls irukura name entha name nalum kudukaalam but name antha name kudutha than vera oruthar 
		this.employeeName = employeeName;//this.class = ithu this. enna pannuthuna in this clkass la irukura attribute la neeng akudukura values set pannunga athu tha ithuku meaning          
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", age=" + age + ", employeeId=" + employeeId + "]";
	}

	 



}
