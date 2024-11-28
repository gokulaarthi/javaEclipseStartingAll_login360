package task;
import java.util.Scanner;
public class age_calculator {
	
	public static void main(String[] args) {
		Scanner gokul=new Scanner(System.in);
		
		System.out.println("Enter the birth year");
		int input=gokul.nextInt(); // why the open and close brackets
		
		System.out.println("eneter the current year");
		int input1=gokul.nextInt();
		
		int output=input1-input;
		
//		int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
//		if(output.equals(a||b||c||d||e||f||g||h||i||j||k||l||m||n||o||p||q||r||s||t||u||v||c||w||x||y||z));
		
		System.out.println("your age is: "+output);
		gokul.close();
		
	}

}
