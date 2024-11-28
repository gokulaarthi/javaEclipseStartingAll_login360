package assem;
import java.util.Scanner;

 

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Scanner sca = new Scanner(System.in);
		int start1 = 0;
		do {
			System.out.println(
					"if you want to start press on OR if you want to exict press exict OR if you want to stop press off");
			String start11 = sca.nextLine();
			if (start11.equals("on")) {
				start1++;
				do {
					System.out.println("enter the value for a:");
					double a = scan.nextDouble();
					System.out.println("enter the operator:");
					String operator = sca.nextLine();
					System.out.println("enter the value for b:");
					double b = scan.nextDouble();
					double temp =0;
 					if (operator.equals("+")) {
						System.out.println("Answer is: " + addition(a, b));	
						 temp=addition(a, b);
						
					} else if (operator.equals("-")) {
						System.out.println("Answer is: " + subraction(a, b));
						 temp=subraction(a, b);
					
					} else if (operator.equals("*")) {
						System.out.println("Answer is: " + multiplication(a, b));
						 temp=multiplication(a, b);
					} else if (operator.equals("/")) {

						if (b != 0) {
							System.out.println("Answer is: " + division(a, b));
							 temp=division(a, b);
						}  else if (b == 0) {
							 throw new Exception ("enter the valid number for b");
							 }
					} else if (operator.equals("%")) {
						System.out.println("Answer is: " + reminder(a, b));
						 temp=reminder(a, b);
					}
					System.out.println(" ");
					System.out.println("enter the operator");
					String operator1 = sca.nextLine();
					System.out.println("enter the value for c");
					double c = scan.nextDouble();
					if (operator1.equals("+")) {
						System.out.println("=============> Answer is: " + (temp + c));
					} else if (operator1.equals("-")) {
						System.out.println("=============> Answer is: "+ (temp - c));
					} else if (operator1.equals("*")) {
						System.out.println("=============> Answer is: " + ( temp * c));
					} else if (operator1.equals("/")) {
						if (b != 0) {
							System.out.println("=============> Answer is: "+ (temp / c));
						} else if (b == 0) {
							 throw new Exception ("enter the valid number for b");
							 }
					} else if (operator1.equals("%")) {
						if(c!=0) {
						System.out.println("=============> Answer is: " + (temp % c));
						}
						else {
							System.err.println("you are enter 0 knowned exception");
						}
						
					}
					System.out.println("  " );
					System.out.println("if you want to stop press stop or press start to continue");
					String of = sca.nextLine();
					
					if (of.equals("stop")) {
						start1++;
					}
					else if(of.equals("start")){
						
						
					}
					else {
						throw new Exception("enter the valid datas");
					}
				
				} while (start1 != 2);
				
						System.out.println("your calculator is stopped");
			} else if (start11.equals("excit")) {
				System.out.println("you are now exicted");
				System.exit(0);
			} else if (start11.equals("off")) {
				System.out.println("your calculator is off");
			} else {
				System.err.println("enter the valid names");
			}
		} while (start1 != 1);
		scan.close();
		sca.close();
		
	}
	public static double division(double a, double b) {
		return a / b;
	}
	public static double reminder(double a, double b) {
		return a % b;
	}
	public static double multiplication(double a, double b) {
		return a * b;
	}
	public static double addition(double a, double b) {
		return a + b;
	}
	public static double subraction(double a, double b) {
		return a - b;
	}
	}
