package bank_in;

public class Employee {
	private String name;
	private int age;
	private String id;
	
	public Employee() {
		super();		 
	}
	
	public Employee(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//setter and getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee_name=" + name + ", age=" + age + ", id=" + id ;
	}
	

}
