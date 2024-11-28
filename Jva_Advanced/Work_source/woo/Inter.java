package woo;

import java.util.*;
import java.util.List;

public class Inter {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter: ");
		String name=scanner.nextLine();
		System.out.println("you enter:"+name);
		List<Character> charaterlist=new ArrayList<>();
		
		for(char a:name.toCharArray()) {
			if(a!=' ') {
				charaterlist.add(a);
			}
		}
		
		System.out.println("ater removing space: ");
		System.out.println(charaterlist);
		
		String out =name.replace(" ", "");
		System.out.println(out);
		
	}
 	 
}

 