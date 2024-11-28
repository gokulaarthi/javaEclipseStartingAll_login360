package workout;

public class Duplicate {
	private static final String String = null;

	public static void main(String[] args) {
		
	
	 
	
	String namess []=  {"1","2","3","4","5","3","2","1","5","66","66","57","59","4"};
	
	int vari=0;
	int vari1=0;
	String theName = null;
	
	for(int i=0 ;i<namess.length;i++) {
		for(int j=i+1; j<namess.length;j++) {
	
		if(namess[i]==namess[j]) {
			vari++;
			theName=namess[j];
			namess[i]="removed";
			if(namess[i]==String) {
				vari1++;
				
			}
			
		}
		}
	}
	System.out.println(vari);
	System.out.println(" ");
	
	System.out.println("the output is:");
	for(int i=0 ;i<namess.length;i++) {
		System.out.println(namess[i]);
		
	}
	System.out.println(" ");
	System.out.println(theName);
	System.out.println(" ");
	System.out.println(vari1);
	}
	
	 
	}


