package assem;
import java.util.Scanner;
class ZeroError extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ZeroError(String message) {
		super(message);
	}
    }
public class Calcul {
	public static double addtion(double a, double b) {
		return a + b;
	}
	public static double subratcion(double a, double b) {
		return a - b;
	}
	public static double multiplication(double a, double b) {
		return a * b;
	}
	public static double division(double a, double b) {
		return a / b;
	}
	public static double reminder(double a, double b) {
		return a % b;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a value: ");
		double a = scanner.nextDouble();
		System.out.println("enter a value: ");
		double b = scanner.nextDouble();
		
		System.out.println("Additon of: " + a + " + " + b + " = " + addtion(a, b) + "\n");
		System.out.println("Subraction of: " + a + " - " + b + " = " + subratcion(a, b) + "\n");
		System.out.println("Multiplication of: " + a + " * " + b + " = " + multiplication(a, b) + "\n");
		try {
				System.out.println("Dividion of: " + a + " / " + b + " = " + division(a, b));
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.println("Reminder of: " + a + " % " + b + " = " + reminder(a, b) + "\n");
		scanner.close();
	}
}
