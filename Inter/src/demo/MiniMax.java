package demo;
import java.util.Scanner;
public class MiniMax {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the length of the size");
		int size=scanner.nextInt();
		int [] a=new int[size];
		System.out.println("enter the values");
		for(int i=0;i<a.length;i++){
			a[i]=scanner.nextInt();
		}
		int maxNum=a[0];
		int mini=a[0];
		for(int i=0;i<a.length;i++) {
			if(maxNum<a[i]) {
				maxNum=a[i];
			}
			if(mini>a[i]) {
				mini=a[i];
			}
		}
		System.out.println(maxNum);
		System.out.println(mini);
		scanner.close();
	}
}