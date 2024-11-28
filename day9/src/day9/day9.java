	package day9;
	
	import java.util.Scanner;
	
	public class day9 {
		static int a;
		static int b;
		static int c;
		
		public int mini() {
			
			if(a<b && a<c) {
				 System.out.println("a is the minimum number"+a);
				
			}
			if(b<c && b<a) {
				System.out.println("b is the minimum number"+b);
			}
			else{
				System.out.println("c is the minimum number"+c);
			}
		
		return a;	
		}
		
	
		public static void main(String[] args) {
			Scanner gokul = new Scanner(System.in);
	
			System.out.println("enter avnumber a ");
			 a = gokul.nextInt();
			System.out.println(" the value a is " + a);
	
			
			System.out.println("eneter a number b ");
			 b = gokul.nextInt();
			System.out.println(" the value b is " + b);
			
			System.out.println("enter another number c");
			c =gokul.nextInt();
			System.out.println("the value c is "+c);
			
			
		
			
			day9 Result = new day9();
			Result.mini();
			
	
			gokul.close();
		}
	}
