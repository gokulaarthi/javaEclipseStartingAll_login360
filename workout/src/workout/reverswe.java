package workout;
import java.util.Scanner;
public class reverswe {
	public static void main(String[] args) {
		 Scanner gokul=new Scanner (System.in);
		  System.out.println("enter the what number table you want");
		  int tablenumb=gokul.nextInt();
		  
		  System.out.println("how much upto you want(for exmaple 10 or 15)");
		  int hownumb=gokul.nextInt();
		  
		  for(int i=1;i<=hownumb;i++) {
			  System.out.println(i+"*"+tablenumb+"="+i*tablenumb);
		  }
		  gokul.close();
		 
		  
	}

}
