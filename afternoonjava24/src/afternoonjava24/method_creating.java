package afternoonjava24;

import java.util.Scanner;

public class method_creating {
	public static String gearsControls(String position) {
		switch(position) {
		case "N":
//			System.out.println("the car is in neutral anb now you can able to off the car");
//			break;
			return "the car is in neutral anb now you can able to off the car";
		case "1":
//			System.out.println("1st gear max15km  hr");
//			break;
			return "1st gear max15kmhr";
		case "2":
			return "2nd gear max:50kmphr";
			
		case "3":
//			System.out.println("3rd gear max:80kmphr");
//			break;
			return "3rd gear max:80kmphr";
		case "R":
//			System.out.println("you can go reverse now");
//			break;
			return "you can go reverse now";
		 
			default:
//				System.out.println(position+"not availabke");
				return position+"not availabke";
		}
		
			
		
		
		}
	public static void main(String[] args) throws Exception {
		int carstatus=0;
		String gear="n";
		Scanner carstatusscanner=new Scanner(System.in);
		Scanner gearscanner=new Scanner(System.in);
		
		
			System.out.println("pleas turn on engine 0 or 1");
			carstatus=carstatusscanner.nextInt();
			
			while(carstatus==1) {

			if(carstatus==0) {
				System.out.println("please turn on the engine");
		}
					
		
		else if(carstatus==1) {
			System.out.println("now you can change the gear");
			
			gear=gearscanner.nextLine();
			gearsControls(gear);
		}
			
		else {
			throw new Exception("use only 0 or 1");
		}
			if(gear=="0") {
				System.out.println("turn on the engine da ");
			}
			carstatusscanner.close();
			gearscanner.close();
		
		}
			
	}
	}


