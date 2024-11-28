package task;
import java.util.Scanner;
public class weakdays {

	public static void main(String[] args) {
		Scanner gokul= new Scanner(System.in);
		
		System.out.println("Enter the any one of the wekday number");
		
		String input=gokul.nextLine();
		
		 if(input.equals("1")){
			System.out.println("Monday");
			
		}
		else if(input.equals("2")){
			System.out.println("Tuesday");
			
		}
		else if(input.equals("3")){
			System.out.println("Wednesday");
			
		}
		else if(input.equals("4")){
			System.out.println("Thursday");
			
		}
		else if(input.equals("5")){
			System.out.println("Friday");
			
		}
		else if(input.equals("6")){
			System.out.println("Saturday");
			
		}

		else if(input.equals("7")){
			System.out.println("sunday");
		}
		
		else {
			System.out.println("Enter the valid number");
		}
		gokul.close();

}
}