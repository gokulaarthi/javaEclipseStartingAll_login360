package college.as;

public class College {
	
	
	private String name;
	private int collegeCode;
	private String location;
	
	
	public  College(String name,int collegecode,String location) {
		
		this.name=name;
		this.collegeCode=collegecode;
		this.location=location;
	}


	public String getName() {
		return name;
	}


	public int getCollegeCode() {
		return collegeCode;
	}


	public String getLocation() {
		return location;
	}




}
