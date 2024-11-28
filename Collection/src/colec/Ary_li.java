package colec;

import java.util.*;

public class Ary_li {
	public static void main(String[] args) {
		List<Integer> numbe =new ArrayList<>();
		numbe.add(9);
		numbe.add(10);
		numbe.add(11);
		numbe.add(12);
		numbe.add(13);
		
		List<Integer> mno=new ArrayList<>(6);
		 mno.addAll(numbe);
		 mno.add(11);
		 mno.add(22);
		 mno.add(33);
		 //contains value true or false
		 System.out.println(mno.contains(9));
		
	}

}
