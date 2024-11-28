package workout;

public class max_minki_workout_2 {
	public static void main(String[] args) {
		
		int numbers[]= {56,34,523,76,67,467,13};
		int maximum=0;
		int maximum_second=maximum;
		int minimum=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(maximum<numbers[i]) {
				maximum=numbers[i];
			}
			if(maximum_second<numbers[i]) {
				maximum_second=numbers[i];
			}
			if(minimum>numbers[i]){
				minimum=numbers[i];
			}
		}
	System.out.println("the minimum value is: "+minimum);
	System.out.println(" ");
	System.out.println("the maximum_second value is: "+maximum_second);
	System.out.println(" ");
	System.out.println("the maximum value is: "+maximum);
	}

}
