package workout;

import java.util.Scanner;

public class method_using_auto_google {

	public static void ifyes() {
		Scanner gokul = new Scanner(System.in);
		
		System.out.println("which multiplicationn taable you want?");
		int tablenumb = gokul.nextInt();
		System.out.println("at what number you want?");
		int limit=gokul.nextInt();
	
		for(int i=1;i<=limit;i++) {
			System.out.println(i+"*"+tablenumb+"="+i*tablenumb);
		}		
		gokul.close();
	}

	public static void qas() {
		String answers;
		int points=0;
		Scanner quest = new Scanner(System.in);
		System.out.println("1. What is the colour of the Apple");
		answers = quest.nextLine();
		 if(answers.equals("red")) {
			 System.out.println("correct answer");
			 points++;
		 }
		 else {
			 System.out.println("wrong answer");
		 }
		System.out.println("2. the number 2,4,6,8,10,etc., is odd or even");
		answers = quest.nextLine();
		if(answers.equals("even")) {
			System.out.println("coorect answer");
			points++;
		}
		
		System.out.println("3. could you know more than 6 tables (yes or no) ");
		answers = quest.nextLine();
		System.out.println("4. then say 8*6= ? ");
		answers = quest.nextLine();
		System.out.println("5. what is the national bird?");
		answers = quest.nextLine();
		System.out.println("could you want to see results(ok or no)");
		answers = quest.nextLine();
		 System.out.println(points);
		quest.close();
	}

	public static void main(String[] args) {
		String welcome;
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner qainput1 = new Scanner(System.in);

		Scanner inputtables = new Scanner(System.in);
		System.out.println("hey hi !");
		System.out.println("could you need any help from mee (yes or no)");
		welcome = input.nextLine();

		if (welcome.equals("yes")) {
			System.out.println("oh yeah !  lets say what can i do for you");
			System.out.println("1.tables(enter tables(limited)");
			System.out.println("2.questio and answers (press 'qa' and enter)");

			String welcome2 = input2.nextLine();
			
			if (welcome2.equals("tables")) {
					ifyes();
					
			}
			else if (welcome2.equals("qa")) {
				System.out.println("lets see ");
				qas();
			}
			else if (welcome2.equals("tabel")) {
				System.out.println("very good");
			}

			else {
				System.out.println("invalid");
			}


		}
		System.out.println();
		input.close();
		input1.close();
		input2.close();
		inputtables.close();
		qainput1.close();
	}
}