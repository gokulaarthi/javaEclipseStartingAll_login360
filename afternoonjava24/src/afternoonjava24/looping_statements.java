package afternoonjava24;

import java.util.Scanner;

public class looping_statements {
	public static void main(String[] args) {
		
	
	Scanner name = new Scanner(System.in);
	
//	while(true) {
	System.out.println("eneter the resgister number");
	
	int rollnumber = name.nextInt();
	
	switch (rollnumber)  {
	case 1:
		System.out.println("pass");
		break;
	case 2:
		System.out.println(" pass");
		break;
	case 3:
		System.out.println(" fail");
		break;
	case 4:
		System.out.println(" pass");
		break;
	case 5:
		System.out.println(" fail");
		break;
		default:
			System.out.println(" incalid ! put a valid registeer number ");
			break;

	}
	
//	if(rollnumber==0) {
//		break;
	 
	
//	}
////}
	name.close();
}
}