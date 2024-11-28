package absract;


abstract class Abstract_class {
	
	abstract void display();                     //method declare mattum tha panna mudiyum abstract use panna. itha class call pannumpothu intha method show agathu 
	
	public void method() {                      //nama inthqa class call pannumpothu intha method show agum but antha method show agathu because athu ithula implement agala
		System.out.println("it will display");
	}

 
}
	

 class Gokul extends Abstract_class{

	@Override                                     // ithu real time use vanthu bakened ku theviyanathu ithula vachippom user ku theviyanathu mela irukum 
	void display() {	
		System.out.println("backend process ku thevaiyanathu");
	}

	 	
	
}

  
	 
