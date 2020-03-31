package com.opt.java.atm;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
	ArrayList<String> loginDetails = new ArrayList<String>( );
	//private String password= null;
	//private String password2;
	public void newUser() {
		System.out.println("Enter email address:");
		Scanner sc = new Scanner(System.in);
		String newEmail = sc.nextLine(); // store email
		String password = "1";
		String password2="";
		
		// Checking if email exists
		if (!newEmail.equals("xyz@gmail.com")) {
			loginDetails.add(newEmail);
			System.out.println("Enter Password : ");
			password =sc.nextLine();
			System.out.println("Re-type Password : ");
			password2 =sc.nextLine();
/*			if  (password.equals(password2)) {
				loginDetails.add(password2);
				System.out.println("What is your favourite colour");
				String color = sc.nextLine();
				System.out.println(color + " is your security key, incase if you forget your password.");
				loginDetails.add(color);
				System.out.println("Registration Succesful");
			}
			else {*/
				while(!password.equals(password2)) {
				System.out.println("Re-type Password : ");
				password2 =sc.nextLine();
				}
				loginDetails.add(password2);
		
				System.out.println("Registration Succesful");
			//System.out.println("Password doesn't match !");
			//System.out.println("Re-type Password : ");
			
		}
		else
		{
		
		System.out.println("email already exists !!");
		System.out.println("Enter email address: ");
		}
	
	}
}


