package arrayList;

public class User_ {
	
	private  String name;
	private String email;
	private long mobilenumber;
	 
	public User_(String name, String email,long mobilenumber) {
		this.name=name;
		this.email=email;
		this.mobilenumber=mobilenumber;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}
	
	 
//	@Override
//	
//	public String toString() {
//		return ("name: "+name+"\n"+"email "+email+"\n"+"mobile: "+mobilenumber+"\n");
//	}
}



////////////class//////////////

class Employee{
	private String name;
	private int age;
	private String adress;
	private String id;
	private long adharno;
	
	public Employee() {
		super();
	}
	


//	public Employee(String name, int age,String adress,String id,long adharno) {
//		this.name=name;
//		this.age=age;
//		this.id=id;
//		this.adharno=adharno;
//		this.adress=adress;
//	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAdress() {
		return adress;
	}
	public String getId() {
		return id;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	@Override
	public String toString() {
		return "Employeename=" + name + "\n"+" age=" + age +"\n"+ " adress=" + adress + "\n"+" id=" + id + "\n"+", adharno=" + adharno;
	}
	
}











