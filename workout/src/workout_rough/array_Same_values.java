package workout_rough;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class array_Same_values {
	
	public static String values(Object[] a1,Object[] b1) {
		Set<Object> ab=new HashSet<Object>(Arrays.asList(a1));
		Set<Object> bc=new HashSet<Object>(Arrays.asList(b1));
		if(ab.size()!=bc.size()) {
			return "False from 1";
		}
		for(Object in:ab) {
			if(!bc.contains(in)) {
				return "false form 2";
			}
		}
		return "true";
		
	}
	
	
	public static void main(String[] args) {
		Integer [] a= { 1,2,3,4,5,5,5,5};
		Integer [] b= {1,3,4,5,6};
		Integer [] c= {1,3,2,5,4};
		
		System.out.println(values(a,b));
		System.out.println(values(b,c));
		System.out.println(values(c,a)+" ithu");
	}

}
