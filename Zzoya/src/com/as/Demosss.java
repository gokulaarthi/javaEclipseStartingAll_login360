package com.as;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demosss {
	public static void main(String[] args) {
		List<Integer> lists=new ArrayList<Integer>(Arrays.asList(3,5,18,4,6,5));
		Integer miniValue=lists.get(0);
     	Integer maxValue=lists.get(0);
	
		for(Integer d: lists) {
			if(miniValue>d) {
				miniValue=d;
			}
			if(maxValue<d) {
				
				maxValue=d;
			}
		}
		System.out.println("minimum value: "+miniValue);
		System.out.println("maximum value: "+maxValue);
		System.out.println(" ");
		
		List<Character> lists2=new ArrayList<>(Arrays.asList('a','a','a'));
		
		Character bs=lists2.get(0);
	    boolean a = true;
		for(Character i:lists2) {
			if(!bs.equals(i)) {
				a=false;
			}
		}
		if (a == true) {
			System.out.println("the all values are same");
		} else {
			System.out.println("the values are not same");
		}
		
		
		
		
	}   

}
