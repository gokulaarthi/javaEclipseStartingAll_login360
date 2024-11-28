package workout;

import java.util.Scanner;

public class web {
	
	public static void main(String[] args) {
	Scanner fo = new Scanner(System.in);
	System.out.println("enter the size");
	int size=fo.nextInt();
		
		int array[]=new int[size];
		System.out.println("enter the valus");
		for(int i=0;i<array.length;i++) {
			array[i]=fo.nextInt();
		}
		
boolean dpli=true;
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
			
			if(array[j]==array[i]) {
				dpli=true;
			}
			}
		}
		if(dpli=true) {
		System.out.println("it contains duplicate valiue");
		}
	}

}
