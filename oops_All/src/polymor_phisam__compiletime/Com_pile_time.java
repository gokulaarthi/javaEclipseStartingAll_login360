package polymor_phisam__compiletime;

public class Com_pile_time {
	// same methd name with different parameters or different datatypes is known as methodoverloding
	
	
	//its a same parameter
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	//         or
	
	//its the different data type
	public static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	public static double sum(double a, double b,double c ,double d) {
		return a+b+c+d;
	}
	
	public static void main(String[] args) {
	sum(1,20);
	sum(1, 3, 5);
	sum(3, 3.5, 3, 9.5);
	sum(23, 506, 40, 80);
	}

}
