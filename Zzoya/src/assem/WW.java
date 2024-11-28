package assem;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WW {

	public static void main(String[] args) {
		String io = "goukl";
		String bio = "aarthi";
		System.out.println(io.concat(bio));

		String name = "goky";
		char[] chari = name.toCharArray();
		String reversed = "";

		for (int i = chari.length - 1; i >= 0; i--) {
			reversed = reversed + chari[i];
		}
		System.out.println(reversed);
//		
//		int a=25      0000;
//		int b=12;
//		System.out.println(a/b);
////		Scanner sca=new Scanner(System.in);
//		
//		int io=sca.nextInt();
//		
//		
//		for(int i=1;i<=io;i++) {
//			
//			if(i==2 || i==3) {
//				System.out.println(i);
//			}
//			
//			if((i%2)!=0) {
//				
//				if((i%3!=0)){
//					System.out.println(i);
//				}
//				
//			}
//		}

//		
//		int[] a= {1,2,3,4,5,6};
//		
//     	int b[] = {1,2,7,12,11,8,9,3};
//	
//	  Set<Integer> merge=new TreeSet<Integer>();
//	  for(Integer num:a ) {
//		  merge.add(num);
//	  }
//	  for(Integer num:b ) {
//		  merge.add(num);
//	  }
//	  
////	  List<Integer>  duplic=new ArrayList<>();
////	  
////	  for(Integer duplo: b) {
////		  if(merge.contains(duplo)) {
////			  duplic.add(duplo);
////		  }
////	  }
//		merge.forEach(s->System.out.println(s));
	}

}
