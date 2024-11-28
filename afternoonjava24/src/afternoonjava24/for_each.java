package afternoonjava24;

import java.util.Scanner;

public class for_each {
	public static void main(String[] args) {
		Scanner gokul= new Scanner(System.in);
		
		System.out.println("enter the size of the arrry");
		int size = gokul.nextInt();
		
		
		System.out.println("eneter hre values");
		int marks[]=new int[size];
		
		for(int i=0; i<marks.length;i++) {
			marks[i]=gokul.nextInt();
		}
		System.out.println("the values are");
		
		//nested for oru nmumber aduthu aduthu add agum
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("i= "+marks[i]+"   ");
			
			for(int j=i+1; j<marks.length;j++) {
				
				System.out.println("i="+marks[i]+" + "+"j="+marks[j]);
				System.out.println("total= "+(marks[i]+marks[j]));
			}

	}
		gokul.close();
		
	}

}
