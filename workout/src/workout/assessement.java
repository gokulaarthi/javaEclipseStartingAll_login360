package workout;

import java.util.Scanner;

public class assessement {
	public static void main(String[] args) {
		Scanner importuser = new Scanner(System.in);
		Scanner remove = new Scanner(System.in);
		
		Scanner exit1 = new Scanner(System.in);
		
		

		int[] datas = new int[5];
		System.out.println("enter the values");
		for (int i = 0; i < datas.length; i++) {//getting 20 datas fom the user
			datas[i] = importuser.nextInt();
		}
		for (int i = 0; i < datas.length; i++) {//showing the datas to the user the data is corect or not
			System.out.println("the index number" + i + " the data stored: " + datas[i]);
		}
		
//		while(remove1.equals("yes")); {
		System.out.println(" ");
		System.out.println("if you want to remove the data from it enter yes");//asking if you want to erase the data from it
		String remove11 = remove.nextLine();
	
		if (remove11.equals("yes")) {
			System.out.println("enter the index number you want to remove");//if the say "yes" asking what index number you want to erase
			int removeindex = importuser.nextInt();

			datas[removeindex] = 0;//the the index data was erased it was replaced into zer0
		} 
			 
		 
		for (int i = 0; i < datas.length; i++) {///here we are showing the user to the all of the data the user erased data also
			System.out.println("the index number" + i + " the data stored: " + datas[i]);
		}
		System.out.println(" ");
		System.out.println("if you want to add data from it enter yes");//asking the user that they will able to change the already entered data
		String removedata = remove.nextLine();

		if (removedata.equals("yes")) {

			System.out.println("eneter the index number you want to remove");//here we are asking to eneter the index number to change
			int thenumber = importuser.nextInt();
			System.out.println("enter the value for the index number");//here the data the user what he want to add or change asking  
			datas[thenumber] = importuser.nextInt();//in this line the index number enter from the user was enter in the place thenumber and again wee ask the data from the user if the enter then it will store to the index number in the array present
		} 
		for (int i = 0; i < datas.length; i++) {
			System.out.println("the index number" + i + " the data stored: " + datas[i]);
		}
		System.out.println(" ");
		 
	
		System.out.println("if you want to exit press 1");
	    String  exit12=exit1.nextLine();
	    if (exit12.equals("1")) {
	    	System.exit(0);
	    }
	    
		
		
//	}
		importuser.close();
		remove.close();
		exit1.close();
		
	}}
//}

