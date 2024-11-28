  package exception_handling;

import java.util.Scanner;

class InvalidDataException extends RuntimeException{

	/**
	 * 
	 */
 	private static final long serialVersionUID = 1L;

	public InvalidDataException(String message) {
		super(message);
	}
	
	
	
	
	 
}
public class Except {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	int a =scanner.nextInt();
	int b=scanner.nextInt();
		
		
		try {
			if(b==2) {
			throw new InvalidDataException("invalid data found....!");///messsage send pannurom antha class ku
			}
			else if(b==0){
				throw new InvalidDataException("p....!");
			}
			
		}catch (InvalidDataException e) {
			
			System.err.println(e+"whats happen");
			 
		}
		int total=a/b;
		System.out.println(total);
		
				
//		try {
//
//			int ans=12/0;
//			
//		}catch (Exception e) {// inga vanthu enna exceptionnalum varum so nam Exception kututhu irukkom apo ithu unknowned exception
//			///suppose namakku excataa oru exception theriyum na antha edathula atha exception name kudukalam
//			
//			System.err.println(e.getMessage());
//			System.err.println(e);
//			 
//		}         
//		System.out.println("completed");
	}

}