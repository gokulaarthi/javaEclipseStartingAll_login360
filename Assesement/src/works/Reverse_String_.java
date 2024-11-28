package works;

import java.util.Scanner;

public class Reverse_String_ {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String a=scanner.nextLine();//gett input from user by Scanner
		//creating a variable in string to store the characters from the loop
		String revers="";
	  //here converting the string to character
		char [] characte=a.toCharArray();
	//running the for loop reversely one by one 
		for(int i=characte.length-1;i>=0;i--) {
	//adding the charcters from the last of the index.
	//we cant adding the character direct to the string  variable so we add a empty string 
			revers =revers+ characte[i];
			 
		}
		System.out.println("After Reverse: ");
		System.out.println(revers);
		scanner.close();
	}

}
