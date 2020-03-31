package com.opt.java.atm;

import java.util.Scanner;

public class ATMConsole {

	public static void menu() {
		System.out.println("User Home Page :"); 
		System.out.println("1.Register"); 
		System.out.println("2.Login");
		System.out.println("3.Forgot Password");
		System.out.println("4.Logout (exit)");
		System.out.println();
		System.out.println("Enter Your Choice : "); // presents choices and accepts user input 
	}
	
	public static void main(String[] args) {
	menu();
	Scanner sc = new Scanner (System.in);
	
	int choice = sc.nextInt();
	while(!(choice > 4))
	{	
	if (choice == 1) {
		Register reg = new Register ();
		reg.newUser();
	}
	else if (choice ==2) {
		UserController uc = new UserController();
		uc.login();
		UserService us = new UserService();
		us.service();
	}
	else if (choice == 3) {
		ForgetPassword ff= new ForgetPassword();
		ff.resetPass();
		
	}
	else if (choice == 4) {
		System.out.println("Logout successfully");
		break;
	}
	
	menu();
	choice = sc.nextInt();
	}
	
	}
	
}
