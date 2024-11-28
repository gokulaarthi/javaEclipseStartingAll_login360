package works;
import java.util.*;
import java.util.stream.Collectors;
public class User_Main {
	private static int age;

	public static void main(String[] args) {
		Scanner scannername = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		// creating a hashset for collecting the without dubliate datas
		Collection<User_list> inn = new ArrayList<User_list>();
		// using for loop upto 20
		// because to create a object 20 times and at the same time adding the geting
		// input
		// from the user by using scanner
		for (int i = 1; i <= 3; i++) {
			System.out.println("user name: ");
			String name = scannername.nextLine();// at every itteration got input from user
			System.out.println("enter age: ");
			try {
			int age = scanner.nextInt();
			}catch(Exception e) {
				System.err.println("eneter valid data");
			}
			System.out.println("Enter email: ");
			String mai = scannername.nextLine();
			// creating a abject to the user_list(class) and passing the arguments to the constructer
			User_list userr = new User_list(name, age , mai);
			System.out.println(" ");
			// here, adding the object to the HashSet
			inn.add(userr);
		}
		System.out.println(inn);
		
		
		
		System.out.println(inn.size());
		 
		scannername.close();
		scanner.close();
	}
}
