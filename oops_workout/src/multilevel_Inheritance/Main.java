package multilevel_Inheritance;

public class Main {
	
	public static void main(String[] args) {
		
		GrandFather obj =new GrandFather();
		System.out.println("grandfather");
	System.out.println("   work:"+" "+obj.work());	
	System.out.println("   Favourite sports:"+" "+obj.sports());	
	System.out.println("   charecter:"+" "+obj.charecter());	
	
	GrandFather obj1 =new Father();
	System.out.println("Father");
	System.out.println("   work:"+" "+obj1.work());	
	System.out.println("   Favourite sports:"+" "+obj1.sports());	
	System.out.println("   charecter:"+" "+obj1.charecter());

	
	Father obj3=new Father();
	System.out.println(obj3.sports());
	
	
	
	
		
	}

}
