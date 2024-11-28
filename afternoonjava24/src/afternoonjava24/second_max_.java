package afternoonjava24;

public class second_max_ {
	public static void main(String[] args) {
		int numb[] = { 10, 20, 40, 50, 60, 70 }; // intialisation panni irukom

		int max = numb[0];
		int max2 = numb[0];
		int temp = 0;
		for (int i = 0; i < numb.length; i++) {
			temp = max;
			if (max < numb[i]) {
				max = numb[i];
				if (temp < max) {
					max2 = temp;
				}
			}
		}
		System.out.println("the max is: " + max);
		System.out.println("the max2 is: " + max2);
	}

}
