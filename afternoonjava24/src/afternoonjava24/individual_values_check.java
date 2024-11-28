package afternoonjava24; 
 
public class individual_values_check {
	public static void main(String[] args) {
		
	String name="java";
	
	char namechar[]=name.toCharArray();
	
	int apresent=0;
	for(int i=0;i<name.length();i++) {
		if(namechar[i]=='a') {
			apresent++;
		}
	}
  System.out.println("a present in the given letterr is: "+apresent);
}
} 