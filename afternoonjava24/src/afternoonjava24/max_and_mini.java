package afternoonjava24;

public class max_and_mini {
	public static void main(String[] args) {
		int numb[]= { 8,2,3,4,5,6,7,1};
//		int max=numb[0];   
		int mini=numb[0];
		for(int i=0; i<numb.length;i++) {
//			if(max<numb[i]) {
//				max=numb[i];
//			}
			if(mini>numb[i]){
				mini=numb[i];
			}
		}
//		System.out.println("the maxi is: "+max);
		System.out.println("the mini is: "+mini);
	}

}
