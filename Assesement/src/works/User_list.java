package works;

public class User_list {
	
	//creating the data members with private
	private String username ;
	private int age;
	private String email;
	//creating the parameterrised constructer to set the values for the attributes
	public User_list(String name,int age,String email) {
		this.username=name;
		this.age=age;
		this.email=email;
	}
	//here we using get method to get the values from the attributes
	public String getName() {
		return username;
	}
	public int getAge() {
		return age;
	}
	public String geteMail() {
		return email;
	}
@Override
	public String toString() {
		return "\n"+"Username=" + username + "\n"+"age=" + age + "\n"+"email=" + email + "\n";
	}
	

}
