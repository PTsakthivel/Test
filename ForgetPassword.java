package com.opt.java.atm;

import java.util.Scanner;

public class ForgetPassword {

	public void resetPass() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your ID: ");
		sc.nextLine();
		System.out.println("Enter security key :"); 
		String colour = sc.nextLine();
		System.out.println("Enter new password : ");
		String password=sc.nextLine();
		System.out.println("Retype password : ");
		String password2=sc.nextLine();
		if (!password.equals(password2)) {
			System.out.println("Password does not match");
			System.out.println("Retype password : ");
			String password3=sc.nextLine();
			if (password.equals(password3)) {
			System.out.println("What is your favourite colour ?");
			String color = sc.nextLine();
			System.out.println("your new security key is :"+ color);
			System.out.println();
			System.out.println("Your password has been reset successfully.");
			System.out.println();
			}
		}
		else {
			System.out.println("What is your favourite colour ?");
			String color = sc.nextLine();
			System.out.println("your new security key is :"+ color);
			System.out.println();
			System.out.println("Your password has been reset successfully.");
			System.out.println();
		}
	}
	
	
}
