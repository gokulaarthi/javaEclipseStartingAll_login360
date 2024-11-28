package interview_question.Prapa_sir;
import java.util.*;
import java.io.*;
public class Shfule_ {
	public static int so(int a) {
		if(a==10) {
			return 10;
		}
		System.out.println(a);
		return so(++a); 
		
	}
	    public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the size :");
//			int size=sc.nextInt();
//			int[] a=new int[size];
//			System.out.println("Enter the numbers :");
//			for(int i=0;i<a.length;i++){
//				a[i]=sc.nextInt();
//			}	
//			Random random=new Random();
//			for(int i=0;i<a.length;i++){
//				int position=random.nextInt(a.length);
//				int temp=a[position];
//				a[position]=a[i];
//				a[i]=temp;
//				
//			}
//			System.out.println("After shuffel: ");
//			for(int i=0;i<a.length;i++){
//				System.out.print(a[i]);
//			}	
//			sc.close();
	 
//	    			Scanner sc = new Scanner(System.in);
//	    			System.out.println("Enter the number:");
//	    			int number=sc.nextInt();
//	    			int a=0,b=1,c=1;
//	    			for(int i=1;i<=number;i++){
//	    				System.out.print(a+", ");
//	    				a=b;
//	    				b=c;
//	    				c=a+b;
//	    			}
//	    			sc.close();
//	    			
//	    	    }
//	    	}
//	    		List<Integer> lists = new ArrayList<Integer>();
//	    		lists.add(1);
//	    		lists.add(2);
//	    		lists.add(3);
//	    		lists.add(4);
//	    		lists.add(5);
//	    		List<Integer> lists2 = new ArrayList<Integer>();
//	    		lists2.add(6);
//	    		lists2.add(7);
//	    		lists2.add(3);
//	    		lists2.add(9);
//	    		lists2.add(5);
//	    lists.addAll(lists2);
	   
//	lists.forEach(s->{
//		if(lists.contains(s)) {
//			lists.remove(s);
//		}
//	});
	
	
//	Integer[] num= {1,2,3,4,5,3,4,8};
//	int max=num[0];
//	int mini=max;
//	int temp;
//	for(int i=0;i<num.length;i++) {
//		temp =max;
//		if(max<num[i]) {
//			max=num[i];
//		}
//		if(temp<max) {
//			mini=temp;
//		}
//	}
//	System.out.println(mini);
//	System.out.println(max);
//	

System.out.println(so(1));

}
}

