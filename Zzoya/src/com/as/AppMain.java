package com.as;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {
   public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	
	List<AppUsers> lists = new ArrayList<>();
	
	for(int i=0;i>-1;i++) {
		System.out.println("enter 1:add 2:read 3:delete 4:exict");
		String input=scan.next();
		if(input.equals("1")) {
			AppUsers appUsers = new AppUsers();
			System.out.println("enter the id");
			int userID=scan.nextInt();
			appUsers.setId(userID);
			System.out.println("enter the userrname");
			String userNames=scan.next();
			appUsers.setUserName(userNames);
			System.out.println("enter the pasword");
			String userpasword=scan.next();
			appUsers.setPassword(userpasword);		
			lists.add(appUsers);
			System.out.println("added sucessfully:");
		}
		else if(input.equals("2")) {
			lists.forEach(s->System.out.println(s.getUserName()+" "+s.getId()));
		}
		else if(input.equals("3")) {
			System.out.println("enter the id you want to delete");
			int id=scan.nextInt();
			for(AppUsers s : lists) {
				try {
		
				if(s.getId()==id) {
					lists.remove(id);
				}}catch(Exception e) {
					System.out.println(e);
				}
			}
		}
		else if(input.equals("4")) {
			System.out.println("exict sucessfully");
			scan.close();
			break;
		}
		else {
			System.out.println("no operation found");
		}
	}
}

}
