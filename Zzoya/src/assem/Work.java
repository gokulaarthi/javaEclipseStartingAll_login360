package assem;

import java.util.*;
 

public class Work {
 
public static void main(String[] args) {
    
    Scanner scanner=new Scanner(System.in);   
//    char[] chari=name.toCharArray();    
//    for(int i=0;i<chari.length;i++) {
//    	if(chari[i]==' ') {
//    		System.out.println("present Space");
//    	}
//    }
    
	 String name=  scanner.nextLine();
    List<Character> araylis=new ArrayList<>();
 
  for(char po: name.toCharArray()){
	  if(po!=' ') {
	 araylis.add(po);
	  }
	   
  }System.out.println(" removining the sapce value");
 
  System.out.println(araylis);
  
  
  
  
  
  
  
  
  
  
  
  
}}