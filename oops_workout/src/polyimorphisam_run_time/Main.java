package polyimorphisam_run_time;

 

public class Main {
	public static void main(String[] args) {
		CAr objectname = new CAr ();
		System.out.println(objectname.modelName());
		
		CAr objectName = new Honda();
		System.out.println( objectName.modelName());
		
		CAr objectname1=new Bmw();
		System.out.println(objectname1.modelName());
	}

}
