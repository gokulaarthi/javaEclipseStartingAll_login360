package workout_rough;

public class Reverse_number {
	public static void main(String[] args) {

		int gokul[] = { 0, 1, 2, 3, 4, 5 };
		
		
//		second method
//		Scanner aarthi = new Scanner(System.in);
//		
//		int gokul[] =new int [5];
//		
//		for(int i=0;i<gokul.length;i++) {
//			gokul[i]=aarthi.nextInt();
//		}

		for (int i = gokul.length - 1; i < gokul.length; i--) {

			if (i >= 0) {

				System.out.println(gokul[i]);
			}
		}

	}
}
