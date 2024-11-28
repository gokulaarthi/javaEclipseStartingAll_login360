package constructer;

public class  Para {

	
	private String Names;
	private int Ages;
	 
	//default constructer
//	public Para() {
//		super();
//	}
	
	

	 
//ithu  vanthu parameterised constructer
	public Para(String name,int age) {
		this.Names=name;
		this.Ages=age;
		 
	}
	
	public String getNames() {
		return Names;
	}


	public int getAges() {
		return Ages;
	}
}


	 
