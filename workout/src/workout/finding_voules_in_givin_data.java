package workout;

import java.util.Scanner;

public class finding_voules_in_givin_data {
	public static void main(String[] args) {

		Scanner gokul = new Scanner(System.in);
		System.out.println("enter the word to find the voules how many present in it");

		String given = gokul.nextLine();
 

		char datas[] = given.toCharArray(); ///important line

		int apresent = 0;
		int epresent = 0;
		int ipresent = 0;
		int opresent = 0;
		int upresent = 0;

		for (int i = 0; i < given.length(); i++) {
			if (datas[i] == 'a') {
				apresent++;
			}
			if (datas[i] == 'e') {
				epresent++;
			}
			if (datas[i] == 'i') {
				ipresent++; 
			}
			if (datas[i] == 'o') {
				opresent++;
			}
			if (datas[i] == 'u') {
				upresent++;
			}
			
		}
		System.out.println("=======================");
		System.out.println("the vaule a is present in the given data: " + apresent);
		System.out.println("=======================");
		System.out.println("the vaule e is present in the given data: " + epresent);
		System.out.println("=======================");
		System.out.println("the vaule i is present in the given data: " + ipresent);
		System.out.println("=======================");
		System.out.println("the vaule o is present in the given data: " + opresent);
		System.out.println("=======================");
		System.out.println("the vaule u is present in the given data: " + upresent);
		System.out.println("=======================");

		gokul.close();

	}

}
