package polymorphisam_compile_time;

public class CompileTime {

	
//	polymorphisam na method name oru mari irukum  but parameterss vera vera vangurathu
	
	public static int sum (int a, int b) {
		return a+b;
	}
	
	public static double sum (double a, int b) {
		return a*b;
	}
	public static float sum(float a, float b) {
		return a+b;
	}
	public static String name(String a , String b) {
		 
		return a+" "+b;
	}
	public static double sum (double a, int b, int c, int d) {
		return a*b;
	}

	 
	
	 public static void main(String [] args) {
//		float total = (float)  sum(9.5,4);
//		String total1= name("gokul", "anbu");
		double total2 = sum(3,5,6,7);
		System.out.println(total2);
	}

	



}
