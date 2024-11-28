package workout;

public class Abs {
	public static void main(String[] args) {
		String name="numbers";
		char [] io=name.toCharArray();
		
		for(int i=0;i<io.length;i++) {
			for(int j=i;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<i;k++) {
				System.out.println(io[k]);
			}
		}
	}

}
