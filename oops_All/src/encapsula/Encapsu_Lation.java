package encapsula;

public class Encapsu_Lation {
	
	private String name;
	private int age;
	private String email;
	
	public Encapsu_Lation(String name,int age,String email) {
		this.name=name;
		this.age=age;
		this.email=email;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}
	
	//we can able to set the value by setermethod also
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
